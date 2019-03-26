package model.state;

public class Takeoff extends State {
    private static Takeoff instance = new Takeoff();

    private Takeoff() {

    }

    public static State instance() {
        return instance;
    }

    /*public void push(Button b){
        b.setCurrent(Flying.instance());
        System.out.println("    Drone is flying to destination");
    }*/

    public String getCurrentState(){
        return "    Takeoff";
    }
}
