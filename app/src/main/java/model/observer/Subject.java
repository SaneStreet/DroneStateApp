package model.observer;

import java.util.ArrayList;
import java.util.List;

import model.state.State;

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private String state;

    public String getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state.getCurrentState();
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
