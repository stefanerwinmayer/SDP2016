package thirdclient;

import first.AImpl;
import spec.A;

class AFactory {
    public static A getInstance() {
        return new AImpl();
    }

}
