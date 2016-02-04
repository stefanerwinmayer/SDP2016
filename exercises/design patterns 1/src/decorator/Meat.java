package decorator;

/**
 * Created by stefanm on 04/02/2016.
 */
public class Meat extends PizzaDecorator {
    public Meat(Pizza pizza) {
        super(pizza);
        price = 14.25;
        description = "Meat";
    }
}
