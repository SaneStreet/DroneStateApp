package model.state;

public abstract class State {

    State s;

    /*public void push(Button b) {
        b.setCurrent(Inactive.instance());
        System.out.println("    Drone is inactive");
    }*/
    public abstract String getCurrentState();

    public void setState(State s){
        this.s = s;
    }

}
