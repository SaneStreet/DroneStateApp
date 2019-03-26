package model.state;

import model.FlightController;

public class Landing extends State{
    private static Landing instance = new Landing();
    private FlightController controller;

    private Landing() {
        controller.startLanding();

    }

    public static State instance() {
        return instance;
    }

    public String getCurrentState(){
        return "    Landing";
    }
}
