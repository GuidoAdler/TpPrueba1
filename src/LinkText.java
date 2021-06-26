public class LinkText extends BaseText {

    private PlainText text;
    final protected String myStartTag = "<a href:";
    final protected String myEndTag = "</a>";
    @Override
    public String source() {
        return getStartTag() + text.source() + getEndTag();
    }

    public LinkText(PlainText text, String s) {
        this.text = text;

        setTags(myStartTag + s + ">", myEndTag);
    }

    public LinkText(HTMLText Text, String s) {
        setTags(myStartTag + s + ">", myEndTag);

        if (Text instanceof BaseText) {
            text = ((BaseText) Text).getPlainText();

            setTags(startTag + ((BaseText) Text).getStartTag(), ((BaseText) Text).getEndTag() + endTag);

        }
    }

    @Override
    public void setTags(String startTag, String endTag) {
        this.startTag = startTag;
        this.endTag = endTag;
    }

    public String toString() {
        return this.source();
    }

    public PlainText getPlainText() {
        return text;
    }

}