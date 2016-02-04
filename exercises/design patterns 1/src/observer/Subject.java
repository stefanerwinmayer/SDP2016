package observer;

/**
 * Created by stefanm on 04/02/2016.
 */
public interface Subject {
    void subscribeObserver(Observer observer);

    void unSubscribeObserver(Observer observer);

    void notifyObservers();

    String subjectDetails();
}