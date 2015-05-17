
public class SmartPhone extends MobilePhone{

    public void browseWeb(String myWebsite)
    {
        System.out.println("Visiting website at: " + myWebsite);
    }
    public String findPosition()
    {
        return "current GPS coordinates are: Lat: 20. 0' 00''  Long: -10 0' 0''";
    }
}
