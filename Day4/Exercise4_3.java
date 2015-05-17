import java.util.Scanner;
public class Exercise4_3
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
 
 String str;
 double myAmountBorrowed = 0.0;
 int myTerm = 0;
 double myRate = 0.0;
 double myTotalAmount = 0.0;
 double myYearlyPayment = 0.0;
     
 System.out.println ("Please enter total amount borrowed for your mortgage");
 str = System.console().readLine();
 myAmountBorrowed = Double.parseDouble(str);
     
 System.out.println ("Please enter number of years to pay your mortgage back");
 str = System.console().readLine();
 myTerm = Integer.parseInt(str);
     
     
 System.out.println ("Please enter interest rate");
 str = System.console().readLine();
 myRate = Double.parseDouble(str);
  
 myTotalAmount = calculateTotalAmount(myAmountBorrowed, myRate);
 myYearlyPayment = calculateYearlyPayment(myTotalAmount, myTerm);
    
 System.out.println ("The total amount to be paid is: " + myTotalAmount );
 System.out.println ("The money to be paid every year is: " + myYearlyPayment );
 System.out.println ("The number of years before the interest is paid and only the initial capital remains: " +  calculateYearsUntilCapital (myAmountBorrowed, myTotalAmount, myYearlyPayment) );
 
 
 
 } private static double calculateTotalAmount( double cost, double rate)
 		{             
                  	double myTotalCost=0.0;
                 	 myTotalCost = cost * (1 + (rate/100));
                  	return myTotalCost;
 		}
   
  private static double calculateYearlyPayment (double totalAmount, int years)
                  {
                                  double myYearlyAmount = 0.0;
                                  myYearlyAmount = totalAmount / years;
                                  return myYearlyAmount;
                  }
   
  private static double calculateYearsUntilCapital (double cost, double totalAmount, double YearlyPayment)
                  {
                                  double myYearsUntilCapital = 0.0;
                                  myYearsUntilCapital = (totalAmount - cost)/YearlyPayment;
                                  return myYearsUntilCapital;
                  }
                                 
 
 
}

