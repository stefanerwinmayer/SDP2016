package observer;

/**
 * Created by stefanm on 04/02/2016.
 */
public class SMSUsers implements Observer {
    Subject subject;
    String name;

    public SMSUsers(Subject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update(String desc) {

    }

    @Override
    public void subscribe() {
        subject.subscribeObserver(this);
        System.out.println(name + " subscribed to " + subject.subjectDetails());
    }

    @Override
    public void unSubscribe() {

    }
}
