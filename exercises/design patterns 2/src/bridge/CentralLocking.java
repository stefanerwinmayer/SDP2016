package bridge;

public class CentralLocking implements Product {
    private String productName;

    public CentralLocking(String productName) {
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
