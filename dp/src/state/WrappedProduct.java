package state;

public class WrappedProduct extends Product {

    private Product mContents;
    private GiftType mGiftType;

    public WrappedProduct(Product p, GiftType g) {
        super(p.getPrice());
        mContents = p;
    }

    public void setGiftType(GiftType g) {
        mGiftType = g;
    }

    @Override
    public float getPrice() {
        return mContents.getPrice() + mGiftType.getWrapPrice();
    }
}
