import java.util.Scanner;

class NumberReaderAverage {

    public int averageOfTen (int numberOfItems)
    {
        int count = numberOfItems;
        int result = 0;
        String str;
        int sum = 0;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input " + numberOfItems + " numbers to calculate average");

            while (count != 0) {
                try
                {
                    System.out.println("Please input next number");
                    str = myScanner.nextLine();
                    result = Integer.parseInt(str);
                    sum = sum + result;
                    count--;

                } catch (NumberFormatException ex)
                {
                    System.out.println("Your input is not a number. Try again");
                }
            }
        return sum/numberOfItems;
    }

    public int averageOfTen ()
    {
        int count;
        int numberOfItems;
        int result;
        int sum = 0;
        String str;

        System.out.println("Please input how many numbers you want to enter to calculate average");
        numberOfItems = getNumber();
        count = numberOfItems;

        System.out.println("Please input " + numberOfItems + " numbers to calculate average");

        while (count != 0) {
                result = getNumber();
                sum = sum + result;
                count--;
        }
        return sum/numberOfItems;
    }


    private int getNumber() {
        int myNumber = 0;
        String str;
        Scanner myScanner = new Scanner(System.in);
        Boolean myFlag = false;

        while (!myFlag) {
            try {
                System.out.println("Please input your number");
                str = myScanner.nextLine();
                myNumber = Integer.parseInt(str);
                myFlag = true;

            } catch (NumberFormatException ex) {
                System.out.println("Your input is not a number. Try again");
            }
        }
        return myNumber;
    }
}
