package PROTOTYPE;

public class PrototypeExample {

    public static void main(String[] args) {

        Document original = new Document("Este es el original");
        Document copia = (Document) original.clone();
        
        System.out.println(original);
        System.out.println(copia);

    }
}
