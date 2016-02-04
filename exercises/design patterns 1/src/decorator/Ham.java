package decorator;

/**
 * Created by stefanm on 04/02/2016.
 */
public class Ham extends PizzaDecorator {
    public Ham(Pizza pizza) {
        super(pizza);
        price = 18.12;
        description = "Ham";
    }
}
