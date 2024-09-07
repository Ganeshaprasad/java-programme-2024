package javaconceptpractice;

import java.util.List;

public class MarqueeComponent {
    private String name;
    private String type;
    private List<Element> elements;

    public MarqueeComponent(String name, String type, List<Element> elements) {
        this.name = name;
        this.type = type;
        this.elements=elements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }
}
