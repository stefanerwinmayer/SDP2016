package decorator;

/**
 * Created by stefanm on 04/02/2016.
 */
public class SimplyVegPizza implements Pizza {
    private int price;
    private String description;


    public SimplyVegPizza() {
        price = 230;
        description = "SimplyVegPizza (" + price + ")";
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
