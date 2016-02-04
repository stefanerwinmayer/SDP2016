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

    }

    @Override
    public void unSubscribe() {

    }
}
