package decorator;

/**
 * Created by stefanm on 04/02/2016.
 */
public class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
        price = 20.72;
        description = "Cheese";
    }
}
