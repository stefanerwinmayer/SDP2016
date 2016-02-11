package abstractfactory;

/**
 * Created by stefanm on 11/02/2016.
 */
public class NYCFactory implements AbstractParserFactory {

    public XMLParser getParserInstance(String parserType) {
        XMLParser parser = null;
        switch (parserType) {
            case "NYCORDER": parser = new NYCORDER(); break;

        }
        return parser;
    }
}
