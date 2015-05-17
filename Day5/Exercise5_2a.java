import java.util.Scanner;
public class Exercise5_2a
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{

int MyAnswer = 0;

MyAnswer = factorialRecursive(3);

System.out.println("Answer using factorialRecursive is :" + MyAnswer);

MyAnswer = factorialIterative(3);

System.out.println("Answer using factorialIterative is :" + MyAnswer);

} private static int factorialRecursive(int n) 
	{
 		if (n == 1) 
 			{
 				return 1;
 			} 
 		else {
 			int result = n * factorialRecursive(n-1);
 			return result;
 			}
 	}
 	
 private static int factorialIterative(int n)
	{
		int MyResult = n;
		n--;
		while (n!=1)
			{
				MyResult = MyResult * n;
				//println("Current result :" + MyResult);
				n--;
			}
		return MyResult;
	}
				
				
				
}

