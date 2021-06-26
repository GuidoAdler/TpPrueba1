public abstract class BaseText implements HTMLText {
    @Override
    public String source() {
        return null;
    }

    String startTag;
    String endTag;

    abstract void setTags(String startTag, String endTag);

    String getStartTag() {
        return startTag;
    }

    String getEndTag() {
        return endTag;
    }

    PlainText getPlainText() {
        return null;
    }
}