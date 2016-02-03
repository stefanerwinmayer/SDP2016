package factorymethod;

/**
 * Created by stefanm on 02/02/2016.
 */
public interface Creator {

    Product getProduct();

    Product getProduct(String product);
}
