import java.util.Scanner;

public class Exercise7_2
{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input mark between 0 and 100. When want to stop enter -1 ");
        int myMark=0;
        int myMarksCount = 0;
        int myDistinctionsCount=0;
        int myPassCount=0;
        int myFailCount=0;
        int myInvalidsCount=0;

        do
        {
            System.out.print("Input a mark: ");
            myMark = Integer.parseInt(myScanner.nextLine());
            if (myMark>=70 && myMark <=100)
            {
                myDistinctionsCount++;
            }
            else if (myMark>=50 && myMark <=69)
            {
                myPassCount++;
            }
            else if (myMark>=0 && myMark<=49)
            {
                myFailCount++;
            }
            else if (myMark==-1)
            {
                //do nothing
            }
            else
            {
                myInvalidsCount++;
            }

        }
        while (myMark!=-1);
        System.out.println("");
        myMarksCount = myDistinctionsCount+myPassCount+myFailCount;
        System.out.println("There are " + myMarksCount + " students: " + myDistinctionsCount + " distinctions, " + myPassCount + " pass, " + myFailCount + " fails (plus " + myInvalidsCount + " invalid).");
    }
}
