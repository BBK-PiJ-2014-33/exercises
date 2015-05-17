import java.util.Scanner;
public class exercise4
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println ("Please type in any number");
String MyString = System.console().readLine();
int MyFirstNumber = Integer.parseInt(MyString);
System.out.println ("Please type in another number");
MyString = System.console().readLine();
int MySecondNumber = Integer.parseInt(MyString);
int MyResult = MySecondNumber*MyFirstNumber;
System.out.println ("Product of two inputted numbers is: " + MyResult);
int MySecondResult = 0;
while (MySecondNumber!=0) {
MySecondResult = MySecondResult + MyFirstNumber;
MySecondNumber--;
}
System.out.println ("Product of two inputted numbers is: " + MySecondResult);
}}

