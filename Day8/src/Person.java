
public class Person {
    private String name;
    private Person next;

    public Person (String myName)
    {
        name = myName;
        //next = null;
    }
    public String getName()
    {
        return name;
    }
    public Person getNext()
    {
        return next;
    }
    public void setNext(Person myPerson)
    {
        next = myPerson;
    }
}
