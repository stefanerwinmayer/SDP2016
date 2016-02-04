package decorator;

/**
 * Created by stefanm on 04/02/2016.
 */
public class Spinach extends PizzaDecorator {
    public Spinach(Pizza pizza) {
        super(pizza);
        price = 7.92;
        description = "Spinach";
    }
}
