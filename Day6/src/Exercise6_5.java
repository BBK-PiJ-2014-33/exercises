public class Exercise6_5 {
    public static void main(String[] args)
    {

        Matrix myMatrix = new Matrix(3,3);
        myMatrix.setMatrix("1,2,3;4,5,6;7,8,9");
        myMatrix.checkMyMatrix();
        myMatrix.setMatrix("1,2,3;2,4,5;3,5,1");
        myMatrix.checkMyMatrix();
        myMatrix.setMatrix("1,2,3;0,4,5;0,0,1");
        myMatrix.checkMyMatrix();

        MatrixChecker myMatrixChecker = new MatrixChecker();

        //test isTriangular
        int [] [] myTestArray6 =new int[][]{
                {1,2,3},
                {0,4,5},
                {0,0,1}
        };

        int [] [] myTestArray7 =new int[][]{
                {1,2,3},
                {2,4,5},
                {3,5,1}
        };

        System.out.println(myMatrixChecker.isTriangular(myTestArray6));
        System.out.println(myMatrixChecker.isTriangular(myTestArray7));


        //test isSymmetrical with two dimensional array
        int [] [] myTestArray4 =new int[][]{
                {1,2,3},
                {2,4,5},
                {3,5,1}
        };

        int [] [] myTestArray5 =new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(myMatrixChecker.isSymmetrical(myTestArray4));
        System.out.println(myMatrixChecker.isSymmetrical(myTestArray5));

        //test isSymmetrical with one dimensional array
        int [] myTestArray1 = {1,2,2,1};
        int [] myTestArray2 = {1,2,3,2,1};
        int [] myTestArray3 = {1,2,3,4};

        System.out.println(myMatrixChecker.isSymmetrical(myTestArray1));
        System.out.println(myMatrixChecker.isSymmetrical(myTestArray2));
        System.out.println(myMatrixChecker.isSymmetrical(myTestArray3));



    }
}
