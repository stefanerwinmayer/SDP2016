package singleton;

public class SingletonEager {
    private static SingletonEager eagerSingleton = new SingletonEager();

    public static SingletonEager getInstance() {
        return eagerSingleton;
    }
}