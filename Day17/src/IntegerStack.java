
public class IntegerStack
{
    private class Node
    {
        private int myItem;
        private Node next;
    }

    private Node stackTop;

    public void push(int myInteger)
    {
        Node newStackTop = new Node();
        newStackTop.myItem = myInteger;
        newStackTop.next = stackTop;
        stackTop = newStackTop;
    }
    public int pop ()
    {
        if (stackTop==null) {
            return 0;
        }
        else
        {
            int myReturnItem = stackTop.myItem;
            stackTop= stackTop.next;
            return myReturnItem;
        }
    }

    public boolean isEmpty ()
    {
        if (this.stackTop == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
