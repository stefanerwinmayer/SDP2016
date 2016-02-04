package observer;

/**
 * Created by stefanm on 04/02/2016.
 */
public interface Observer {
    void update(String desc);

    void subscribe();

    void unSubscribe();
}

