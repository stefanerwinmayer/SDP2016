package abstractfactory;

import java.net.URLClassLoader;

/**
 * Created by stefanm on 11/02/2016.
 */
public class ParserFactoryProducer {

    public static AbstractParserFactory getFactory(String factory) {
        AbstractParserFactory parserFactory = null;
        switch (factory) {
            case "NYCFactory":
                parserFactory = new NYCFactory();
                break;
            case "LondonFactory":
                parserFactory = new LondonFactory();
                break;
        }
        return parserFactory;
    }
}
