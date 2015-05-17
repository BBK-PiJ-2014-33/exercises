/**
 * Created by lulu on 24/11/2014.
 */
public class IntegerTreeNode {
    int value;
    IntegerTreeNode left;
    IntegerTreeNode right;

public IntegerTreeNode (int myValue)
{
    this.value = myValue;
}

    public void add (int newNumber)
    {
        if (newNumber > this.value)
        {
            if (right == null)
            {
                right = new IntegerTreeNode(newNumber);
            }
            else
            {
                right.add(newNumber);
            }
        }
        else
        {
            if (left == null)
            {
                left = new IntegerTreeNode(newNumber);
            }
            else
            {
                left.add(newNumber);
            }
        }
    }

    public boolean contains (int n)
    {
        if (n == this.value)
        {
            return true;
        }
        else if (n > this.value)
        {
            if (right == null)
            {
                return false;
            }
            else
            {
                return right.contains(n);
            }
        }
        else
        {
            if (left == null)
            {
                return false;
            }
            else
            {
                return left.contains(n);
            }
        }
    }
    public int getMax()
    {
        int myResult = 0;
        if (right == null)
        {
            if(left==null)
            {
                return this.value;
            }
            else
            {
                return left.getMax();
            }
        }
        else if (left == null)
        {
            if(right == null)
            {
                return this.value;
            }
            else
            {
                return right.getMax();
            }
        }
        else if (right.value > left.value)
        {
            return right.getMax();
        }
        else
        {
            return left.getMax();
        }

    }

    public int getMin()
    {
        if (right == null)
        {
            if(left==null)
            {
                return this.value;
            }
            else
            {
                return left.getMin();
            }
        }
        else if (left == null)
        {
            if(right == null)
            {
                return this.value;
            }
            else
            {
                return right.getMin();
            }
        }
        else if (right.value < left.value)
        {
            return right.getMin();
        }
        else
        {
            return left.getMin();
        }

    }

    @Override

    public String toString()
    {
        String myStringRepresentation = "";

        myStringRepresentation = myStringRepresentation + "[" + value;

        if (left == null)
        {
            //myStringRepresentation = myStringRepresentation + " L" + "[" + "]";
        }
        else
        {
            //myStringRepresentation = myStringRepresentation + " L";
            myStringRepresentation = myStringRepresentation + left.toString();
        }

        if (right == null)
        {
            //myStringRepresentation = myStringRepresentation + " R" + "[" + "]";
        }
        else
        {
            //myStringRepresentation = myStringRepresentation + " R";
            myStringRepresentation = myStringRepresentation + right.toString();
        }
        myStringRepresentation = myStringRepresentation + "]";

        return myStringRepresentation;
    }

    public int depth()
    {
        int myLeftDepth=0;
        int myRightDepth=0;
        if (left == null)
        {
           if (right == null)
           {
               //do nothing
           }
            else
           {
               myRightDepth=myRightDepth + right.depth()+1;
           }
        }
        else if (right == null)
        {
            if (left == null)
            {
                //do nothing
            }
            else
            {
                myLeftDepth=myLeftDepth + left.depth()+1;
            }
        }

        else
        {
            myRightDepth=myRightDepth + right.depth()+1;
            myLeftDepth = myLeftDepth + left.depth()+1;
        }

        if(myLeftDepth>=myRightDepth)
        {
            return myLeftDepth;
        }
        else
        {
            return myRightDepth;
        }
    }
}

