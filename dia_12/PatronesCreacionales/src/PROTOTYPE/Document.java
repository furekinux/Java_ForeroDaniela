package PROTOTYPE;

public class Document implements Prototype{
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public Prototype clone() {
        return new Document(this.content);
    }

    @Override
    public String toString() {
        return "Document{" + "content=" + content + '}';
    }

}
