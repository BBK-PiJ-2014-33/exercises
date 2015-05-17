
public class LibraryUserImpl implements LibraryUser{
    private static int UserID[] = new int [3];
    private String UserName;
    public LibraryUserImpl (String name)
    {
        UserName = name;
    }
    public String getName()
    {
        return UserName;
    }

    public int getID() {
        return 0;
    }

    public int setID(int myID) {
        return 0;
    }
}
