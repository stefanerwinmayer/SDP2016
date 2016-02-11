package abstractfactory;

/**
 * Created by stefanm on 11/02/2016.
 */
public class LondonFactory implements AbstractParserFactory {
    public XMLParser getParserInstance(String parserType) {
        XMLParser parser = null;
        switch (parserType) {
            case "LondonFEEDBACK": parser = new LondonFEEDBACK(); break;

        }
        return parser;
    }
}
