public class Matrix 
	{ 
		private int [] [] myArray;
        int MatrixDimension1;
        int MatrixDimension2;

		public Matrix ( int x, int y) 
			{
                MatrixDimension1 = x;
                MatrixDimension2 = y;
				myArray = new int [MatrixDimension1][MatrixDimension2];
				for (int i = 0; i < MatrixDimension1; i++)
					{ 
						for (int k = 0; k < MatrixDimension2; k++)
							{ 
								myArray [i][k] = 1; 
							} 
					} 
			} 
		public void setElement (int dimension1, int dimension2, int newValue)
			{
				if ((dimension1<MatrixDimension1 ) && (dimension2<MatrixDimension2))
					{                                                 
						myArray [dimension1][dimension2] = newValue; 
					} 
			} 
		public void setRow (int myRowDimension, String myNewRowValues)
			{
                int elementValue = 0;
                //check first that there are enough columns in matrix
                //count number of elements in the string
                int count=getNumberOfItemsInString(myNewRowValues, ',');

                if (myRowDimension<MatrixDimension1 && count+1 == MatrixDimension2)
                {
                   count = 0;
                    int previousSeparatorPosition=0;
                   for (int i = 0; i<myNewRowValues.length();i++)
                    {
                        if (myNewRowValues.charAt(i)==',')
                        {
                            elementValue = Integer.parseInt(myNewRowValues.substring(previousSeparatorPosition,i));
                            previousSeparatorPosition=i+1;
                            setElement(myRowDimension,count,elementValue);
                            count = count+1;
                        }
                        else if (i==myNewRowValues.length()-1)
                        {
                            elementValue = Integer.parseInt(myNewRowValues.substring(previousSeparatorPosition));
                            setElement(myRowDimension,count,elementValue);
                        }
                    }

                }
			}
        public void setColumn (int myColumnDimension, String myNewColumnValues)
        {
            int elementValue = 0;
            int count=getNumberOfItemsInString(myNewColumnValues, ',');
            if (count+1==MatrixDimension1 && myColumnDimension < MatrixDimension2)
            {
                count = 0;
                int previousSeparatorPosition=0;
                for (int i = 0; i<myNewColumnValues.length();i++)
                {
                    if (myNewColumnValues.charAt(i)==',')
                    {
                        elementValue = Integer.parseInt(myNewColumnValues.substring(previousSeparatorPosition, i));
                        previousSeparatorPosition=i+1;
                        setElement(count,myColumnDimension,elementValue);
                        count = count+1;
                    }
                    else if (i==myNewColumnValues.length()-1)
                    {
                        elementValue = Integer.parseInt(myNewColumnValues.substring(previousSeparatorPosition));
                        setElement(count,myColumnDimension,elementValue);
                    }
                }

            }

        }
        private int getNumberOfItemsInString(String myString, Character mySeparator)
        {
            int count=0;
            for (int i = 0; i<myString.length();i++)
            {
                if (myString.charAt(i)== mySeparator)
                {
                    count = count +1;
                }
            }
            return count;
        }
        @Override
        public String toString()
        {
            String myString = "[";
            for(int i=0; i<MatrixDimension1; i++)
            {
                for(int y=0; y<MatrixDimension2;y++)
                {
                    myString = myString + myArray [i] [y];
                    if (y!=MatrixDimension2-1)
                    {
                        myString = myString + ",";
                    }
                }
                if (i!=MatrixDimension1-1)
                {
                    myString = myString + ";";
                }
            }
            myString = myString + "]";
            return myString;
        }
        public void prettyPrint() {
            for (int i = 0; i < MatrixDimension1; i++) {
                for (int y = 0; y < MatrixDimension2; y++) {
                    System.out.print(myArray[i][y]);
                    System.out.print('\t');
                }
                System.out.println("");
            }
            System.out.print("");
        }
        public void setMatrix (String myStringMatrix)
        {
            int count = 0;
            int semicolonIndex=0;
            String mySubstring = "";
            count = getNumberOfItemsInString(myStringMatrix,';')+1;
            for (int i =0; i<count-1; i++)
            {
                semicolonIndex = myStringMatrix.indexOf(';');
                mySubstring = myStringMatrix.substring(0,semicolonIndex);
                setRow(i,mySubstring);
                myStringMatrix = myStringMatrix.substring(semicolonIndex+1);
            }
            setRow(count-1,myStringMatrix);

        }

        public void checkMyMatrix()
        {
            MatrixChecker myMatrixChecker = new MatrixChecker();
            if (myMatrixChecker.isSymmetrical(this.myArray))
            {
                System.out.println("This matrix is symmetrical");
            }
            else
            {
                System.out.println("This matrix is not symmetrical");
            }

            if (myMatrixChecker.isTriangular(this.myArray))
            {
                System.out.println("This matrix is triangular");
            }
            else
            {
                System.out.println("This matrix is not triangular");
            }
        }
	}