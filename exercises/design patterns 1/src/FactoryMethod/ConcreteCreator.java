package factorymethod;

/**
 * Created by stefanm on 02/02/2016.
 */
public class ConcreteCreator implements Creator {
    public Product getProduct() {
        return getProduct("");
    }

    public Product getProduct(String product) {
        return new ConcreteProduct(product);
    }
}
