package decorator;

/**
 * Created by stefanm on 04/02/2016.
 */
public class RomaTomatoes extends PizzaDecorator {
    public RomaTomatoes(Pizza pizza) {
        super(pizza);
        price = 5.20;
        description = "Roma Tomatoes";
    }
}
