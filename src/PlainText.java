public class PlainText implements HTMLText {
    private String textVariable;

    PlainText(String text) {
        textVariable = text;

    }

    public PlainText() {}

    public void setText(String text) {

        textVariable = text;

    }

    @Override
    public String source() {
        return textVariable;
    }

}