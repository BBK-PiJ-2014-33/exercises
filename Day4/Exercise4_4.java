import java.util.Scanner;
public class Exercise4_4
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String str;
int choice;
   
System.out.println ("Please enter choose one of the following options: to convert binary number to decimal enter 1; to convert decimal number binary enter 2");
   
str = System.console().readLine();
   
choice = Integer.parseInt(str);
   
switch (choice)

 {
        case 1:
        	System.out.println ("Please enter binary number you wish to convert to decimal mumber");
        	str = System.console().readLine();
        	int result = binary2decimal (str);
        	System.out.println ("Binary number ” + str “ is equivalent to decimal number " + result);
        	break;
        case 2:
        	System.out.println ("Please enter decimal number you wish to convert to binary mumber");
        	str = System.console().readLine();
        	int myDecimal = Integer.parseInt(str);
        	String myResult = decimal2binary (myDecimal);
        	System.out.println ("Decimal number " + myDecimal + " is equivalent to Binary number " + myResult);
        	break;
 }


} private static int toPower (int number, int power)
	{
		int myResult;
		myResult = number;
		while (power>-1)
			{		
				myresult=myResult*number;
				power--;
			}
			return myResult;
	}

 private static int binary2decimal(String myString)
                  {
                  int myResult = 0;
                  int mySingleBit;
                  int myStringLength = myString.length;
                  String mySubString;
                  for (i=myStringLength; i >-1; i--)
                   		{
                   			mySubString = myString(i, i-1);
                   			if (mySubString =="0")
                   				{
                   					myResult = myResult + 0*(toPower(2,i));
                   				}
                   				else if (mySubString =="1")
                   				{
                   					myResult = myResult + 1*(toPower(2,i));
                   				}
                   		}
                   		
                  return myresult;
                  	
                  }
   
String decimal2binary(int)
                  {
                  }
   
   
 
}

