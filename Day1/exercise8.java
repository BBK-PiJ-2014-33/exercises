import java.util.Scanner;
public class exercise8
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{

System.out.println ("Please enter as many POSITIVE numbers as you like. To finish enter -1");

String str;
int MyNewNumber=0;
int MyMaxNumber=0;

str = System.console().readLine();
MyNewNumber =Integer.parseInt(str);

while (MyNewNumber!=-1)
 	{
 		if( MyNewNumber > MyMaxNumber)
             		{
             			MyMaxNumber = MyNewNumber;
          		}
 		str = System.console().readLine();
 		MyNewNumber =Integer.parseInt(str);
 	}
 System.out.println ("Highest number was: " + MyMaxNumber);


}}

