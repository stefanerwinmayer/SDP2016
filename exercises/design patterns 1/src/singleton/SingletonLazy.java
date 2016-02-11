package singleton;

public class SingletonLazy {

    private static SingletonLazy lazySingleton = null;

    public static SingletonLazy getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new SingletonLazy();
        }
        return lazySingleton;
    }
}