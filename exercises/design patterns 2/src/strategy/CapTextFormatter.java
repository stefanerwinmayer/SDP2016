package strategy;

/**
 * Created by smayer04 on 04/02/2016.
 */
public class CapTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println("[CapTextFormatter]: " + text.toUpperCase());
    }
}
