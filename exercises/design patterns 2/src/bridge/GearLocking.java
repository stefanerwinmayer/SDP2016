package bridge;

public class GearLocking implements Product {
    private String productName;

    public GearLocking(String productName) {
        this.productName = productName;
        //throw new UnsupportedOperationException();
    }

    @Override
    public String productName() {
        return productName;
        //throw new UnsupportedOperationException();
    }

    @Override
    public void produce() {
        System.out.println("Producing " + productName());
        //throw new UnsupportedOperationException();
    }
}