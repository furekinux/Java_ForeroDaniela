package FACTORY;

public class FactoryMethodExample {
    //Definición:Factory Method es un patrón de diseño que define una
    // interfaz para crear un objeto, pero permite que las subclases
    // decidan qué clase instanciar. Se utiliza para delegar
    // la responsabilidad de la creación de objetos a subclases especializadas.
    public static void main(String[] args) {
        DocumentFactory factory = new PDFDocumentFactory();
        Document document = factory.createDocument();
        document.open();
    }
}
