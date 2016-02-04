package decorator;

/**
 * Created by stefanm on 04/02/2016.
 */
import java.text.DecimalFormat;
public class TestDecoratorPattern {
    private static DecimalFormat dformat;

    static {
        dformat = new DecimalFormat("#.##");
    }

    public static void main(String[] args) {
        Pizza pizza = new SimplyVegPizza();
        pizza = new RomaTomatoes(pizza);
        print(pizza);

        pizza = new GreenOlives(pizza);
        print(pizza);

        pizza = new Spinach(pizza);
        print(pizza);

        pizza = new SimplyNonVegPizza();
        print(pizza);

        pizza = new Meat(pizza);
        print(pizza);

        pizza = new Cheese(pizza);
        print(pizza);

        pizza = new Ham(pizza);
        print(pizza);
    }
    private static void print(Pizza pizza) {
        System.out.println("Desc: " + pizza.getDesc());
        System.out.println("Price: " + dformat.format(pizza.getPrice()));
    }
}
/* Output:
Desc: SimplyVegPizza (230), Roma Tomatoes (5.20), Green Olives (5.47), Spinach (7.92)
Price: 248.59
Desc: SimplyNonVegPizza (350), Meat (14.25), Cheese (20.72), Cheese (20.72), Ham (18.12)
Price: 423.81
*/
