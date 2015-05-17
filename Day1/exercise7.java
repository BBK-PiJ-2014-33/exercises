import java.util.Scanner;
public class exercise7
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
 int MyFirstNumber;
 int MySecondNumber;
 int MyThirdNumber;

 int MyHighestNumber;
 int MyMiddleNumber;
 int MyLowestNumber;

System.out.println ("Please type in any number");
String MyString = System.console().readLine();
MyFirstNumber = Integer.parseInt(MyString);
System.out.println ("Please type in another number");
MyString = System.console().readLine();
MySecondNumber = Integer.parseInt(MyString);
System.out.println ("Please type in a third number");
MyString = System.console().readLine();
MyThirdNumber = Integer.parseInt(MyString);

 if ( MyFirstNumber >=  MySecondNumber)
 	{
 		MyHighestNumber = MyFirstNumber;
 		MyMiddleNumber = MySecondNumber;
 		
 		if (MyFirstNumber >=  MyThirdNumber)
                 	{
				if ( MySecondNumber >=  MyThirdNumber)
					{
						MyLowestNumber = MyThirdNumber;
                                        }
                                 else
                                 	{
 						MyMiddleNumber = MyThirdNumber;
 						MyLowestNumber = MySecondNumber;
                                        }
                 	}
 		else
                 	{
                                 MyHighestNumber = MyThirdNumber;
                                 MyMiddleNumber = MyFirstNumber;
                                 MyLowestNumber = MySecondNumber;
                 	}
 	}
 else
        {
 		MyHighestNumber = MySecondNumber;
		MyMiddleNumber = MyFirstNumber;
		if (MySecondNumber>=  MyThirdNumber)
                 	{
				if (MyFirstNumber >=  MyThirdNumber)
					{
 						MyLowestNumber  = MyThirdNumber;
                                        }
                                 else
                                        {
						MyMiddleNumber = MyThirdNumber;
						MyLowestNumber = MyFirstNumber;
					}
			}
 		else
                 	{
                                 MyHighestNumber = MyThirdNumber;
                                 MyMiddleNumber = MySecondNumber;
                                 MyLowestNumber = MyFirstNumber;
                 	}
	}
System.out.println (MyLowestNumber + " " + MyMiddleNumber + " " + MyHighestNumber);
}}

