import java.util.Scanner;
public class exercise11
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println ("Please enter five separate cards");

String[] MyRankArray;
String[] MySuitArray;
MyRankArray = new String[6];
MySuitArray = new String[6];

for (int count = 1; count <6; count = count +1)
	{ 
		System.out.println ("Please key in rank of card number " + count);
		MyRankArray[count] = System.console().readLine();
		System.out.println ("Please key in suit of card number " + count);
		MySuitArray[count] = System.console().readLine();
	}
		
}}

