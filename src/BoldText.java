public class BoldText extends BaseText {

    private PlainText text;
    final protected String myStartTag = "<b>";
    final protected String myEndTag = "</b>";
    @Override
    public String source() {
        return getStartTag() + text.source() + getEndTag();
    }

    public BoldText(PlainText text) {
        this.text = text;
        setTags(myStartTag, myEndTag);
    }

    public BoldText(HTMLText Text) {

        setTags(myStartTag, myEndTag);

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

    @Override
    public String toString() {
        return this.source();
    }

    public PlainText getPlainText() {
        return text;
    }

}