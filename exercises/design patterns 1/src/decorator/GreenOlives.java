package decorator;

/**
 * Created by stefanm on 04/02/2016.
 */
public class GreenOlives extends PizzaDecorator {
    public GreenOlives(Pizza pizza) {
        super(pizza);
        price = 5.47;
        description = "Green Olives";
    }
}
