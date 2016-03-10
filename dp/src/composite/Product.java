package composite;


public abstract class Product {

    protected float mPrice;

    public Product(float price) {
        mPrice = price;
    }

    public float getPrice() {
        return mPrice;
    }

}
