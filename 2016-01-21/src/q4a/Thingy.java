package q4a;

public interface Thingy {
    void myThingy();
    void anotherMyThingy();
}

abstract class ThingyAdapter implements Thingy {

    @Override
    public void myThingy() {}

    @Override
    public void anotherMyThingy() {}
}

class SubThingy extends ThingyAdapter {
    @Override
    public void myThingy() {}
}