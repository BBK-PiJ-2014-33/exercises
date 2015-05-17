
public class MobilePhone extends OldPhone {
    //list of phone numbers
    public void ringAlarm (String time )
    {
        System.out.println("Time is: " + time);
    }
    public void playGame(String myGame)
    {
        System.out.println("Playing game: " + myGame);
    }
    public void printLastNumbers()
    {
        System.out.println("Last called numbers are: ");
    }

    @Override
    public void call(String number) {
        super.call(number);
        //add phone number to
    }
}
