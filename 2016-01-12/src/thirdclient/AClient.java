package thirdclient;

import spec.A;

public class AClient {

    public static void main(String[] args) {
        A a = AFactory.getInstance();
        System.out.println(a.getClass().getName());
    }
}