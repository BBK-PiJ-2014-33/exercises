import java.util.Objects;
import java.util.Scanner;

public class Exercise6_6
{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hi, you need to hit flying target");

        while (myScanner.hasNextLine())
        {
            int userCoordinateX;
            int userCoordinateY;
            int userCoordinateZ;
            Target myTarget = new Target(3);
            String myResult;
            myTarget.init();
            System.out.println("Here they come! Try to bring the plane down!");
            System.out.println("Enter a coordinate X:");
            userCoordinateX = myScanner.nextInt();
            System.out.println("Enter a coordinate Y:");
            userCoordinateY = myScanner.nextInt();
            System.out.println("Enter a coordinate Z:");
            userCoordinateZ = myScanner.nextInt();

            myResult= Objects.toString(myTarget.fire(userCoordinateX, userCoordinateY, userCoordinateZ));
            if(myResult.equals("OUT_OF_RANGE"))
            {
                System.out.println("That shot is out of range. Try harder!");
            }
            else if (myResult.equals("HIT"))
            {
                System.out.println("You hit it! Well done!");
                System.out.println("Would you like to play again?");
                String myDecisionString;
                myDecisionString = myScanner.nextLine();
                if(!myDecisionString.equals("y"))
                {
                    break;
                }
            }
            else if (myResult.equals("FAIL_LEFT"))
            {
                System.out.println("You missed! The target is to the left!");
            }
            else if (myResult.equals("FAIL_RIGHT"))
            {
                System.out.println("You missed! The target is to the right!");
            }
            else if (myResult.equals("FAIL_LOW"))
            {
                System.out.println("You missed! The target is higher!");
            }
            else if (myResult.equals("FAIL_HIGH"))
            {
                System.out.println("You missed! The target is lower!");
            }
            else if (myResult.equals("FAIL_SHORT"))
            {
                System.out.println("You missed! The target is in front!");
            }
            else if (myResult.equals("FAIL_LONG"))
            {
                System.out.println("You missed! The target is behind!");
            }
        }

    }
}
