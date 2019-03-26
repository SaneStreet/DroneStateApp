package model.observer;

import java.util.logging.Logger;

import model.logger.LoggerTest;

public class SenderObserver extends Observer {

    private final static Logger logger = Logger.getLogger(LoggerTest.class.getName());

    public SenderObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){

        System.out.println("*SENDER*   model.state: " + subject.getState());
        //model.logger.log(Level.INFO, subject.getState());
    }
}
