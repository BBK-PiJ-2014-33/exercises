import java.util.Scanner;
public class exercise2_1
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println ("Please enter first number");
   
 String str;
   
 double MyFirstNumber=0;
 double MySecondNumber=0;
 double MyResult=0;
 int MyOperation;
   
   
   
 str = System.console().readLine();
 MyFirstNumber =Double.parseDouble(str);
   
 System.out.println ("Please enter second number");
   
 str = System.console().readLine();
 MySecondNumber =Double.parseDouble(str);
   
   
 System.out.println ("Please enter one of the following options: 1 for addition; 2 for subtraction; 3 for multiplication and 4 for division ");
   
 str = System.console().readLine();
   
 MyOperation = Integer.parseInt(str);
   
   
 switch (MyOperation) {
 case 1:
 MyResult = MyFirstNumber+ MySecondNumber;
 break;
 case 2:
 MyResult = MyFirstNumber- MySecondNumber;
 break;
 case 3:
 MyResult = MyFirstNumber*MySecondNumber;
 break;
 case 4:
 MyResult = MyFirstNumber/ MySecondNumber;
 break;
 }
   
 System.out.println ("The result of chosen operation was: " + MyResult);
}}

