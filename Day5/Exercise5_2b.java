import java.util.Scanner;
public class Exercise5_2b
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{

int[] memoArray;
public memoArray = new int[1000];


int MyAnswer = 0;
MyAnswer = fibRecursiveWithoutMemoization(40);
System.out.println("Answer using input 40 and no memoization is : " + MyAnswer);

MyAnswer = fibRecursiveWithMemoization(40);
System.out.println("Answer using input 40 and memoizationis : " + MyAnswer);

} private static int fibRecursiveWithoutMemoization(int n) 
	{
		if ((n == 1) || (n == 2)) 
			{
				return 1;	
				
			} 
		else 
			{	
				int result = fibRecursiveWithoutMemoization(n-1) + fibRecursiveWithoutMemoization(n-2); // method calls itself
				return result;
			}
	}
	
 private static int fibRecursiveWithMemoization(int n)
	{
		
		if ((n == 1) || (n == 2)) 
			{
				return 1;	
			} 
		else
			{
				if (memoArray[n] !=0)
					{
						return memoArray[n];
					}
				else
					{
						memoArray[n] = fibRecursiveWithMemoization(n-1) + fibRecursiveWithMemoization(n-1);
						return memoArray[n];
					}
			
			}
	}

 private static int fibIterative (int n)
	{
		int MyResult = 0;
		return MyResult;
	
	}
}

