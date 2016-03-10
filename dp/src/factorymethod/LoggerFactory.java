package factorymethod;

public abstract class LoggerFactory {
    public static LoggerFactory getFactory(String f)
            throws Exception {
        return (LoggerFactory) Class.forName(f).newInstance();
    }

    public abstract Logger getLogger();
}
