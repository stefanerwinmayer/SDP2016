package observer;

import java.util.ArrayList;

/**
 * Created by stefanm on 04/02/2016.
 */
public class CommentaryObject implements Subject, Commentary {
    private ArrayList<Observer> observers;
    private String description;
    private String commentary;

    public CommentaryObject(ArrayList<Observer> observers, String description) {
        this.observers = observers;
        this.description = description;
    }

    @Override
    public void subscribeObserver(Observer observer) {;
        observers.add(observer);
        System.out.println(description + " has " + observers.size() + " followers");
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println(description + " has " + observers.size() + " followers");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(commentary);
        }
    }

    @Override
    public String subjectDetails() {
        return description;
    }

    @Override
    public void setDesc(String desc) {
        commentary = desc;
        System.out.println("\nCurrent comment: " + commentary);
        notifyObservers();
    }
}
