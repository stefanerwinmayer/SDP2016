package bridge;

public class GearLocking implements Product {
    private String productName;

    public GearLocking(String productName) {
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