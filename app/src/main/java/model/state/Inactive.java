package model.state;

public class Inactive extends State {
    private static Inactive instance = new Inactive();
    private Inactive() { }

    public static State instance() {
        return instance;
    }

    /*public void push(Button b) {
        b.setCurrent(Takeoff.instance());
        System.out.println("    Drone takes off");
    }*/

    public String getCurrentState(){
        return "    Inactive";
    }
}
