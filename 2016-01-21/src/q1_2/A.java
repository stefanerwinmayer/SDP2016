package q1_2;

public interface A {
    default void myMethod() {}
    default void myMethod2() {}
}

interface B {}

abstract class XXX {}

interface C extends A, B {}

abstract class X implements A, B {
    X(){}
    void myMethodAbs() {}
}

class Thing {
    public static void main(String[] args) {
        X xvar;
    }
}

