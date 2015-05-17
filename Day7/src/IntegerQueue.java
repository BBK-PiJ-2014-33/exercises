
public class IntegerQueue
{
    private Node first;
    private Node last;

    private class Node
    {
        private int myInteger;
        private Node next;

        public Node()
        {
            next=null;
        }
    }

    public IntegerQueue()
    {
        first = null;
        last = null;
    }
    public void insert (int myValue)
    {
        Node lastNode = new Node();
        lastNode.myInteger = myValue;
        if (first==null)
        {
            first = lastNode;
            last = lastNode;
        }
        else
        {
            last.next=lastNode;
            last=lastNode;
        }

    }
    public int retrieve ()
    {
        if (first == null)
        {
            return -1;
        }
        else
        {
            int returnInteger = first.myInteger;
            first = first.next;
            if(first==null)
            {
                last=null;
            }
            return returnInteger;
        }

    }
    public int size(Node myNode)
    {
        if(myNode==null)
        {
            return 0;
        }
        else
        {
            return size(myNode.next)+1;
        }
    }
    public Node getFirst ()
    {
        return this.first;
    }
}
