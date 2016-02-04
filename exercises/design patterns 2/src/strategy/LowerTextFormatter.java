package strategy;

/**
 * Created by smayer04 on 04/02/2016.
 */
public class LowerTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println("[LowerTextFormatter]: " + text.toLowerCase());
    }
}
