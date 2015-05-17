
public class PhoneLauncher {
    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }
    public void launch()
    {
        SmartPhone mySmartPhone = new SmartPhone();
        mySmartPhone.call("0207 158 2033");
        mySmartPhone.ringAlarm("4:45");
        mySmartPhone.playGame("Angry Birds");
        mySmartPhone.printLastNumbers();
        mySmartPhone.findPosition();
        mySmartPhone.browseWeb("http://moodle.bbk.ac.uk");

    }
}
