package javaconceptpractice;

public class Element {
    private String type;
    private String text;

    public Element(String type, String text, String link) {
        this.type = type;
        this.text = text;
        this.link = link;
    }

    public Element(String type, String text) {
        this.type = type;
        this.text = text;
        this.link = null;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    private String link;
}
