import java.lang.reflect.Array;
import java.util.Arrays;

public class EmployeeData {
    private int [] EmployeeID;
    private String [] EmployeeName;
    public EmployeeData()
    {
        EmployeeID = new int [5];
        EmployeeName = new String[5];
        initialiseDataArrays();
    }
    private void initialiseDataArrays()
    {
        for (int i = 0; i<EmployeeID.length; i++)
        {
            EmployeeID[i]=-1;
            EmployeeName [i] ="";
        }
    }
    public void addEmployeeData ( int myID, String myName)
    {
        int myNextIndex = findNextIndex();
        if(myNextIndex!=-1)
        {
            EmployeeID[myNextIndex]=myID;
            EmployeeName[myNextIndex]=myName;
        }
        else
        {
            growDataArrays();
            addEmployeeData(myID,myName);
        }
    }
    private void growDataArrays()
    {
        int [] CopyOfEmployeeID=new int [EmployeeID.length];
        String [] CopyOfEmployeeName = new String [EmployeeName.length];

        for (int i=0; i<EmployeeID.length;i++)
        {
            CopyOfEmployeeID[i]=EmployeeID[i];
            CopyOfEmployeeName[i]=EmployeeName[i];
        }
        EmployeeID = new int [CopyOfEmployeeID.length*2];
        EmployeeName = new String[CopyOfEmployeeID.length*2];
        initialiseDataArrays();
        for (int i=0; i<CopyOfEmployeeID.length;i++)
        {
            EmployeeID[i]=CopyOfEmployeeID[i];
            EmployeeName[i]=CopyOfEmployeeName[i];
        }

    }
    private int findNextIndex()
    {
        for (int i = 0; i<EmployeeID.length;i++)
        {
            if(EmployeeID[i]==-1)
            {
                return i;
            }
        }
        return -1;
    }
    public void printEmployees ()
    {   int nextItem = findNextIndex();
        for (int i =0; i<nextItem-1; i++)
        {
            if(EmployeeName[i].charAt(0)=='S' || !((EmployeeID[i]%2)>0))
            {
                System.out.println("Employee ID: " + EmployeeID[i] + " Employee name: " + EmployeeName[i]);
            }
        }
    }
}
