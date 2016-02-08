package bridge;

public class BigWheel extends Car {

    public BigWheel(Product product, String carType) {
        super(product, carType);
        //throw new UnsupportedOperationException();
    }

    @Override
    public void assemble() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void produceProduct() {
        product.produce();
        System.out.println("Modifying product " + product.productName() + " according to " + carType);
        //throw new UnsupportedOperationException();
    }
}