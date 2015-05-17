
public class Exercise7_7
{
    public static void main(String[] args) {

        IntegerQueue myQueue = new IntegerQueue();
        int myQueueSize = myQueue.size(myQueue.getFirst());
        System.out.println("There are " + myQueueSize + " requests in the queue");
        int myFirstRequest = 5;
        System.out.println("Inserting request " + myFirstRequest + " ...");
        myQueue.insert(myFirstRequest);
        int mySecondRequest = 8;
        System.out.println("Inserting request " + mySecondRequest + " ...");
        myQueue.insert(mySecondRequest);
        int myThirdRequest = 12;
        System.out.println("Inserting request " + myThirdRequest + " ...");
        myQueue.insert(myThirdRequest);
        System.out.println("There are " + myQueue.size(myQueue.getFirst()) + " requests in the queue");
        System.out.println("Retrieving request " + myQueue.retrieve() + " done");
        int myFourthRequest = 13;
        System.out.println("Inserting request " + myFourthRequest + " ...");
        myQueue.insert(myFourthRequest);
        System.out.println("There are " + myQueue.size(myQueue.getFirst()) + " requests in the queue");
        System.out.println("Retrieving request " + myQueue.retrieve() + " done");
        System.out.println("Retrieving request " + myQueue.retrieve() + " done");
        System.out.println("There are " + myQueue.size(myQueue.getFirst()) + " requests in the queue");
    }
}
