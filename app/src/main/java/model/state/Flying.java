package model.state;

public class Flying extends State {
    private static Flying instance = new Flying();

    private Flying() {}

    public static State instance() {
        return instance;
    }

    /*public void push(Button b){
        b.setCurrent(Landing.instance());
        System.out.println("    Drone is landing on destination");
    }*/

    public String getCurrentState(){
        return "    Flying";
    }
}
