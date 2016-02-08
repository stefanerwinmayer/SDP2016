package bridge;

public abstract class Car {
    protected Product product;
    protected String carType;

    public Car(Product product, String carType) {
        this.product = product;
        this.carType = carType;
        //throw new UnsupportedOperationException();
    }

    public abstract void assemble();

    public abstract void produceProduct();

    public void printDetails() {
        throw new UnsupportedOperationException();
    }
}