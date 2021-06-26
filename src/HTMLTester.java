public class HTMLTester {
    public static void main(String[] args) {
        PlainText text = new PlainText("Hola");
        HTMLText boldText = new BoldText(text);
        HTMLText italicText = new ItalicText(text);
        System.out.println(boldText);

        System.out.println(italicText);
        HTMLText boldItalicText = new BoldText(italicText);
        System.out.println(boldItalicText);
        text.setText("ORT");
        System.out.println(boldText);
        System.out.println(italicText);
        System.out.println(boldItalicText);
        HTMLText linkText = new LinkText(text, "ort.edu.ar");
        HTMLText linkBoldText1 = new LinkText(boldItalicText, "ort.edu.ar");
        HTMLText linkBoldText2 = new BoldText(linkText);
        System.out.println(linkText);
        System.out.println(linkBoldText1);
        System.out.println(linkBoldText2);
        text.setText("Ejemplo");
        System.out.println(linkBoldText1);
        System.out.println(linkBoldText2);
    }
}