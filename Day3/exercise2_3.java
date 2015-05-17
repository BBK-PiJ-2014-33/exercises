import java.util.Scanner;
public class exercise2_3
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
double MyTotalCost;
double MyPayment;
double MyRemainder;

int MyFiftyNotes=0;
int MyTwentyNotes=0;
int MyTenNotes=0;
int MyFiveNotes=0;
int MyTwoCoins=0;
int MyOneCoins=0;
int MyFifyPenceCoins=0;
int MyTwentyPenceCoins=0;
int MyTenPenceCoins=0;
int MyFivePenceCoins=0;
int MyTwoPenceCoins=0;
int MyOnePenceCoins=0;
String str;


System.out.println ("Please enter total cost of your purchase");
str = System.console().readLine();
MyTotalCost = Double.parseDouble(str);
System.out.println ("Please enter payment amount");
str = System.console().readLine();
MyPayment = Double.parseDouble(str);
MyRemainder = MyPayment - MyTotalCost;

while (MyRemainder>=0.01)
	{
		if (MyRemainder>=50.0)
			{
				MyFiftyNotes = MyFiftyNotes + 1;
				MyRemainder = MyRemainder - 50.0;
			}
		else if (MyRemainder>20.0)
			{
				MyTwentyNotes = MyTwentyNotes+1;
				MyRemainder = MyRemainder - 20.0;
			}
		else if (MyRemainder>=10.0)
			{
				MyTenNotes = MyTenNotes+1;
				MyRemainder = MyRemainder - 10.0;
			}
		else if (MyRemainder>=5.0)
			{
				MyFiveNotes = MyFiveNotes+1;
				MyRemainder = MyRemainder - 5.0;
			}
		else if (MyRemainder>=2.0)
			{
				MyTwoCoins = MyTwoCoins+1;
				MyRemainder = MyRemainder - 2.0;
			}
		else if (MyRemainder>=1.0)
			{
				MyOneCoins = MyOneCoins+1;
				MyRemainder = MyRemainder - 1.0;
			}
		else if (MyRemainder>=0.5)
			{
				MyFifyPenceCoins = MyFifyPenceCoins+1;
				MyRemainder = MyRemainder - 0.5;
			}
		else if (MyRemainder>=0.2)
			{
				MyTwentyPenceCoins = MyTwentyPenceCoins+1;
				MyRemainder = MyRemainder - 0.2;
			}
		else if (MyRemainder>=0.1)
			{
				MyTenPenceCoins = MyTenPenceCoins+1;
				MyRemainder = MyRemainder - 0.1;
			}
		else if (MyRemainder>=0.05)
			{
				MyFivePenceCoins = MyFivePenceCoins+1;
				MyRemainder = MyRemainder - 0.05;
			}
		else if (MyRemainder>=0.02)
			{
				MyTwoPenceCoins = MyTwoPenceCoins+1;
				MyRemainder = MyRemainder - 0.02;
			}
		else if (MyRemainder>=0.01)
			{
				MyOnePenceCoins = MyOnePenceCoins+1;
				MyRemainder = MyRemainder - 0.01;
			}
		else
			{
				//do nothing
			}
	}
				
				
System.out.println ("Your change was: " + MyFiftyNotes + " X Fifty Pound Notes; " + MyTwentyNotes + " X Twenty Pound Notes; " + MyTenNotes + " X Ten Pound Notes; " + MyFiveNotes + " X Five Pound Notes; " + MyTwoCoins + " X Two Pound Coins; " + MyOneCoins + " X One Pound Coins; " + MyTwentyPenceCoins + " X Twenty Pence Coins; " + MyTenPenceCoins + " X Ten Pence Coins; " + MyFivePenceCoins + " X Five Pence Coins; " + MyTwoPenceCoins + " X Two Pence Coins; " + MyOnePenceCoins + " X One Pence Coins; ");
}}

