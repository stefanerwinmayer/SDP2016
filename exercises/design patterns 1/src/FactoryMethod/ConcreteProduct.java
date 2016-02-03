package factorymethod;

/**
 * Created by stefanm on 02/02/2016.
 */
public class ConcreteProduct implements Product {
        private String product;

        public ConcreteProduct(String product) {
            this.product = product;
        }

        @Override
        public String getProduct() {
            return "product: " + getClass().getName();
        }
}
