public class A {
    void f() {
    }

    void f(int a, int b) {
    }
}

class B extends A {
    @Override
    void f() {
    }

    void f(int a) {
    }
}