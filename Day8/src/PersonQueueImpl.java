
public class PersonQueueImpl implements PersonQueue {
    private Person first;
    private Person last;
    private String counter;
    public PersonQueueImpl(String myCounter)
    {
        first = null;
        last = null;
        counter=myCounter;
    }
    public void insert (Person myPerson)
    {
        if (first == null)
        {
            first = myPerson;
            last = myPerson;
        }
        else
        {
            last.setNext(myPerson);
            //myPerson.setNext(last.getNext());
            last = myPerson;
        }

    }
    public Person retrieve ()
    {
        if (first==null)
        {
            last = null;
            return null;
        }
        Person personToReturn = new Person(first.getName());
        first = first.getNext();
        return personToReturn;
    }
    public String getCounter()
    {
        return counter;
    }
}
