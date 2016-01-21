package q4b;

public interface Thingy {
    default void myThingy() {}
    default void anotherMyThingy() {}
}

class SubThingy implements Thingy {
    @Override
    public void myThingy() {}
}