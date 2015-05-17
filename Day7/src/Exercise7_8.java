
public class Exercise7_8 {
    public static void main(String[] args) {

        IntegerStack myStack = new IntegerStack();
        int myArray []  =  new int [] {5,8,12};

        for (int i = 0; i<myArray.length; i++)
        {
            System.out.println("Pushing " + myArray[i]);
            myStack.push(myArray[i]);
        }


        for (int i = 0; i<=myArray.length; i++)
        {
            if (myStack.isEmpty())
            {
                System.out.println("Stack is empty");
            }
            else {
                System.out.println("Popping.... it is a " + myStack.pop());
            }
        }
    }
}
