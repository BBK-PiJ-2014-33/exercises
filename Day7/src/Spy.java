
public class Spy
{
    private static int spyCount=0;
    private int SpyID=0;

    public Spy(int ID)
    {
        spyCount++;
        SpyID = ID;
        System.out.println("Added Spy's ID is: " + SpyID);
        System.out.println("Current Spy Count is: " + spyCount);
    }

    public static int getNumberOfSpies()
    {
        return spyCount;
    }
    public int getID()
    {
        return SpyID;
    }

    public static void die (int SpyID)
    {
        System.out.println("Spy " + SpyID + " has been detected and eliminated");
        spyCount--;
        System.out.println("Total spy count so far is: " + getNumberOfSpies());
    }
}
