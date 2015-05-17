import java.util.Scanner;
public class Exercise6_7 {
    public static void main(String[] args) {
        int myEmployeeID;
        String myEmployeeName;
        Scanner myScanner = new Scanner(System.in);
        EmployeeData myEmployeeData = new EmployeeData();
        System.out.println("Please enter employee ID");
        myEmployeeID = Integer.parseInt(myScanner.nextLine());
        System.out.println("Please enter employee name");
        myEmployeeName = myScanner.nextLine();
        myEmployeeData.addEmployeeData(myEmployeeID,myEmployeeName);

        while(myEmployeeID!=0 && !myEmployeeName.equals(""))
        {
            System.out.println("Please enter next employee ID");
            myEmployeeID = Integer.parseInt(myScanner.nextLine());
            System.out.println("Please enter next employee name");
            myEmployeeName = myScanner.nextLine();
            myEmployeeData.addEmployeeData(myEmployeeID,myEmployeeName);
        }
        myEmployeeData.printEmployees();
    }
}
