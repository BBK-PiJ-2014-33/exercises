import org.junit.*;
import static org.junit.Assert.*;
public class testAntiAircraftGame {
    @Test
    public void testSetToZero(){
        Target myTarget = new Target(3);
        int [][][] expected= new int [3][3][3];

        int mySize = expected.length;

        for (int i = 0; i<mySize; i++)
        {
            for (int k = 0; k<mySize; k++)
            {
                for (int l= 0; l<mySize; l++)
                {
                    expected[i][k][l] =0;
                }

            }
        }

        myTarget.setToZero();
        //assertEquals(expected,myTarget.myCoordinatesArray);
        assertArrayEquals(expected,myTarget.myCoordinatesArray);


    }
}
