package decorator;

/**
 * Created by stefanm on 04/02/2016.
 */
public class SimplyNonVegPizza implements Pizza {
    private int price;
    private String description;


    public SimplyNonVegPizza() {
        price = 350;
        description = "SimplyNonVegPizza (" + price + ")";
    }

    @Override
    public String getDesc() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
