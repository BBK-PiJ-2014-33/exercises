
public class Exercise7_1 {
    public static void main(String[] args) {
        Spy spy1 = new Spy(001);
        Spy spy2 = new Spy(002);
        Spy spy3 = new Spy(003);
        Spy spy4 = new Spy(004);
        Spy.die(spy4.getID());

    }
}
