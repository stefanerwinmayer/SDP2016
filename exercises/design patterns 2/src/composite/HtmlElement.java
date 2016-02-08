package composite;

public class HtmlElement extends HtmlTag {
    private String tagName;
    private String startTag;
    private String endTag;

    public HtmlElement(String tagName) {
        this.tagName = tagName;
    }
    @Override
    public String getTagName() {
        return null;
    }

    @Override
    public void setStartTag(String tag) {

    }

    @Override
    public void setEndTag(String tag) {

    }

    @Override
    public void generateHtml() {

    }
}