package composite;

public class HtmlParentElement extends HtmlTag {
    private String tagName;
    private String startTag;
    private String endTag;

    public HtmlParentElement(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setStartTag(String tag) {
        startTag = tag;
    }

    @Override
    public void setEndTag(String tag) {
        endTag = tag;
    }

    @Override
    public void generateHtml() {

    }
}