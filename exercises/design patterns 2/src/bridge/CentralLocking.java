package bridge;

public class CentralLocking implements Product {
    private String productName;

    public CentralLocking(String productName) {
        this.productName = productName;
        //throw new UnsupportedOperationException();
    }

    @Override
    public String productName() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void produce() {
        throw new UnsupportedOperationException();
    }
}
