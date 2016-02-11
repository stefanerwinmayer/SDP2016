package singleton;

/**
 * Created by stefanm on 11/02/2016.
 */
public class SingletonTester {
    public static void main(String[] args) {
        SingletonEager eagerSingleton = SingletonEager.getInstance();
        System.out.println(eagerSingleton.getClass().getName());
    }
}
