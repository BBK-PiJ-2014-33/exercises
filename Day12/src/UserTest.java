import org.junit.*;
import static org.junit.Assert.*;


public class UserTest {
    @Test
   public void myUserTest()
    {

        String firstLibraryUser = "Lulu";
        int firstLibraryID = 23;
        int expected = 1;
        LibraryUser myUser1 = new LibraryUserImpl(firstLibraryUser);
        int output = myUser1.setID(firstLibraryID);
        assertEquals(output, expected);


        String secondLibraryUser = "Jean";
        expected = 0;
        LibraryUser myUser2 = new LibraryUserImpl(secondLibraryUser);
        output = myUser2.setID(firstLibraryID);
        assertEquals(output, expected);

    }

}
