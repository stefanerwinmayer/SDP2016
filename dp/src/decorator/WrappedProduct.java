package decorator;

public class WrappedProduct extends Product {

    private Product mContents;

    public WrappedProduct(Product p) {
        super(p.getPrice());
        mContents = p;
    }

    // Override the default get price to return the
    // price plus the wrapping cost (£1.50).
    public float getPrice() {
        return mContents.getPrice() + 1.50f;
    }
}
