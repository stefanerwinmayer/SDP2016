package composite;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {
    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTag> childTags;

    public HtmlParentElement(String tagName) {
        this.tagName = tagName;
        childTags = new ArrayList<HtmlTag>();
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

    public void addChildTag(HtmlTag tag) {
        childTags.add(tag);
    }
}