package observer;

import java.util.ArrayList;

/**
 * Created by stefanm on 04/02/2016.
 */
public class CommentaryObject implements Subject {
    ArrayList observers;
    String description;

    public CommentaryObject(ArrayList observers, String description) {
        this.observers = observers;
        this.description = description;
    }

    @Override
    public void subscribeObserver(Observer observer) {

    }

    @Override
    public void unSubscribeObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }

    @Override
    public String subjectDetails() {
        return "fail";
    }
}
