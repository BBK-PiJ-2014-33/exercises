import java.util.Scanner;
public class exercise9
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{

System.out.println ("Please enter as many POSITIVE numbers as you like. To finish enter-1");

String str;
String MyResult = "Yes";

int MyNewNumber=0;
int MyOldNumber=0;

str = System.console().readLine();
MyNewNumber  = Integer.parseInt(str);
MyOldNumber = MyNewNumber-1;

while (MyNewNumber!=-1)
	{
		if( MyNewNumber != MyOldNumber+1)
             		{
                   		MyResult = "No";
                   	}
       		MyOldNumber = MyNewNumber;
		str = System.console().readLine();
 		MyNewNumber  = Integer.parseInt(str);
 	}
 	
 System.out.println ("The result was: " + MyResult);

}}

