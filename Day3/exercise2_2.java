import java.util.Scanner;
public class exercise2_2
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println ("Please enter you instructions");
   
 String MyUserInstructions;
 double MyFirstNumber;
 double MySecondNumber=0;
 double MyResult=0;
 int MyStringLength;
 char MyOperation;
 int i;

 
 
 MyUserInstructions = System.console().readLine();
 MyStringLength = MyUserInstructions.length();
 
 for (i=1;i<(MyStringLength+1);i++)
 {
 	MyOperation = MyUserInstructions.charAt(i);
 	
 	if (MyOperation == '+')
 		{
 			MyFirstNumber = Double.parseDouble(MyUserInstructions.substring(0,i));
 			MySecondNumber = Double.parseDouble(MyUserInstructions.substring(i+1));
 			MyResult = MyFirstNumber + MySecondNumber;
 			i=MyStringLength+1;
 			
 		}
 	else if (MyOperation == '-')
 		{
 			MyFirstNumber = Double.parseDouble(MyUserInstructions.substring(0,i));
			MySecondNumber = Double.parseDouble(MyUserInstructions.substring(i+1));
			MyResult = MyFirstNumber - MySecondNumber;
 			i=MyStringLength+1;
 		}
 	else if (MyOperation == '*')
 		{
		 	MyFirstNumber = Double.parseDouble(MyUserInstructions.substring(0,i));
			MySecondNumber = Double.parseDouble(MyUserInstructions.substring(i+1));
			MyResult = MyFirstNumber * MySecondNumber;
 			i=MyStringLength+1;
 		}
 	else if (MyOperation == '/')
	 	{
			 MyFirstNumber = Double.parseDouble(MyUserInstructions.substring(0,i));
			 MySecondNumber = Double.parseDouble(MyUserInstructions.substring(i+1));
			 MyResult = MyFirstNumber/MySecondNumber;
 			 i=MyStringLength+1;
 		}
 	else
 		{
 			//continue the loop
 		}
 	}
   
 
 System.out.println ("The result of chosen operation was: " + MyResult);
}}

