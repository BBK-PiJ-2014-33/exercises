
public class scriptClass {
    public static void main(String[] args) {
        
        //build a tree as in notes example
        IntegerTreeNode myIntegerTreeNode1 = new IntegerTreeNode(6);
        myIntegerTreeNode1.add(9);
        myIntegerTreeNode1.add(5);
        myIntegerTreeNode1.add(3);
        myIntegerTreeNode1.add(11);
        myIntegerTreeNode1.add(12);
        myIntegerTreeNode1.add(8);

       //test getMax() method
        int myMaxOfIntegerTreeNode1=0;
        myMaxOfIntegerTreeNode1 = myIntegerTreeNode1.getMax();
        System.out.println("Maximum of this tree 1 is: " + myMaxOfIntegerTreeNode1);

        //test getMin() method
        int myMinOfIntegerTreeNode1=0;
        myMinOfIntegerTreeNode1 = myIntegerTreeNode1.getMin();
        System.out.println("Minimum of this tree 1 is: " + myMinOfIntegerTreeNode1);

        //build tree containing just root
        IntegerTreeNode myIntegerTreeNode2 = new IntegerTreeNode(6);

        //test getMax() method
        int myMaxOfIntegerTreeNode2=0;
        myMaxOfIntegerTreeNode2 = myIntegerTreeNode2.getMax();
        System.out.println("Maximum of this tree 2 is: " + myMaxOfIntegerTreeNode2);

        //test getMax() method
        int myMinOfIntegerTreeNode2=0;
        myMinOfIntegerTreeNode2 = myIntegerTreeNode2.getMin();
        System.out.println("Minimum of this tree 2 is: " + myMinOfIntegerTreeNode2);
        
        //Test toString() method
        System.out.println(myIntegerTreeNode1.toString());

        //Test Depth() method
        System.out.println(myIntegerTreeNode1.depth());
    }
}
