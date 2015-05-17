import java.util.Scanner;
public class exercise6
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
int MyMainResult = 0;
int MyRemainder = 0;
int MyTestNumber = MyFirstNumber;

while (MyTestNumber > 0) {
MyMainResult = MyMainResult + 1;
MyTestNumber = MyTestNumber - MySecondNumber;
}
MyMainResult = MyMainResult - 1;
MyRemainder = MyFirstNumber - MySecondNumber*MyMainResult;
System.out.println (MyFirstNumber + " divided by " + MySecondNumber + " is " + MyMainResult + " , remainder is " + MyRemainder);
}}

