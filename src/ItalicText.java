public class ItalicText extends BaseText {

    private PlainText text;
    final protected String myStartTag = "<i>";
    final protected String myEndTag = "</i>";
    @Override
    public String source() {
        return getStartTag() + text.source() + getEndTag();
    }

    public ItalicText(PlainText text) {
        setTags(myStartTag, myEndTag);

        this.text = text;

    }

    @Override
    public void setTags(String startTag, String endTag) {
        this.startTag = startTag;
        this.endTag = endTag;
    }

    @Override
    public String toString() {
        return this.source();
    }

    public PlainText getPlainText() {
        return text;
    }

}