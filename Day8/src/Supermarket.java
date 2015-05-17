
public class Supermarket {
    PersonQueue checkoutCounterQueue = new PersonQueueImpl("checkout");

    public static void main(String[] args) {
        Supermarket mySupermarket = new Supermarket();
        mySupermarket.launch();
    }
    public void launch()
    {

        testPersonQueue(checkoutCounterQueue);
    }
    public void testPersonQueue(PersonQueue myPersonQueue)
    {
        Person firstShopper = new Person("Anne");
        Person secondShopper = new Person("John");
        Person thirdShopper = new Person("Will");
        Person fourthShopper = new Person("Jane");
        addPerson(firstShopper);
        System.out.println("Shopper " + firstShopper.getName() + " joined queue");
        addPerson(secondShopper);
        System.out.println("Shopper " + secondShopper.getName() + " joined queue");
        System.out.println("Shopper " + servePerson().getName() + " served at queue");
        addPerson(thirdShopper);
        System.out.println("Shopper " + thirdShopper.getName() + " joined queue");
        addPerson(fourthShopper);
        System.out.println("Shopper " + fourthShopper.getName() + " joined queue");
        System.out.println("Shopper " + servePerson().getName() + " served at queue");
        System.out.println("Shopper " + servePerson().getName() + " served at queue");

    }
    public void addPerson(Person myPerson)
    {
        checkoutCounterQueue.insert(myPerson);
    }
    public Person servePerson()
    {
        return checkoutCounterQueue.retrieve();
    }
}
