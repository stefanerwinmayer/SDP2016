package decorator;

/**
 * Created by stefanm on 04/02/2016.
 */
public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;
    protected double price;
    protected String description;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", " + description + "(" + price + ")";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + price;
    }
}
