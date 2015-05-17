public class Target {

    public int [] [] [] myCoordinatesArray;

    public Target(int mySize)
    {
        myCoordinatesArray = new int [mySize][mySize][mySize];
        setToZero();
    }
    public void init ()
    {
        int myArrayDimension = myCoordinatesArray.length;
        int coordinateXToGuess = (int) Math.abs(myArrayDimension * Math.random());
        int coordinateYToGuess = (int) Math.abs(myArrayDimension * Math.random());
        int coordinateZToGuess = (int) Math.abs(myArrayDimension * Math.random());
        setToZero();
        myCoordinatesArray[coordinateXToGuess][coordinateYToGuess][coordinateZToGuess] = 1;

    }
    public Result.result fire (int X, int Y, int Z)
    {
        // find where plane is first
        int [] myPlaneCoordinates = new int [3];
        myPlaneCoordinates = getPlaneCoordinates();

        if(myCoordinatesArray[X][Y][Z] ==1)
        {
            return Result.result.HIT;
        }
        else if ((X<0 || Y<0 || Z<0) || (X>myCoordinatesArray.length-1 || Y>myCoordinatesArray[0].length-1 || Z> myCoordinatesArray[0][0].length))
        {
            return Result.result.OUT_OF_RANGE;
        }
        else if (myPlaneCoordinates[0]>X)

        {
            return Result.result.FAIL_RIGHT;
        }
        else if (myPlaneCoordinates[0]<X)
        {
            return Result.result.FAIL_LEFT;
        }
        else if (myPlaneCoordinates[1]>Y)
        {
            return Result.result.FAIL_LOW;
        }
        else if (myPlaneCoordinates[1]<Y)
        {
            return Result.result.FAIL_HIGH;
        }
        else if (myPlaneCoordinates[2]>Z)
        {
            return Result.result.FAIL_SHORT;
        }
        else
        {
            return Result.result.FAIL_LONG;
        }
    }
    private int [] getPlaneCoordinates ()
    {
        int [] myArray = new int [3];
        for (int i = 0; i<myCoordinatesArray.length-1; i++)
        {
            for (int k = 0; k<myCoordinatesArray[0].length; k++)
            {
                for (int l= 0; l<myCoordinatesArray[0][0].length; l++)
                {
                    if (myCoordinatesArray[i][k][l] == 1)
                    {
                        myArray[0]=i;
                        myArray[1]=k;
                        myArray[2]=l;
                        return myArray;
                    }
                }

            }
        }
        myArray[0]=-1;
        myArray[1]=-1;
        myArray[2]=-1;
        return myArray;
    }
    public void setToZero()
    {
        int mySize = myCoordinatesArray.length;

        for (int i = 0; i<mySize; i++)
        {
            for (int k = 0; k<mySize; k++)
            {
                for (int l= 0; l<mySize; l++)
                {
                    myCoordinatesArray[i][k][l] =0;
                }

            }
        }
    }

}
