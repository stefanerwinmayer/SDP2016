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
        System.out.println(name + " recieved: " + desc);
    }

    @Override
    public void subscribe() {
        System.out.println(name + " subscribed to " + subject.subjectDetails());
        subject.subscribeObserver(this);
    }

    @Override
    public void unSubscribe() {
        System.out.println(name + " unsubscribed from " + subject.subjectDetails());
        subject.unSubscribeObserver(this);
    }
}
