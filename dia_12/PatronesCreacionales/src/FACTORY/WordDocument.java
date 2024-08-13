package FACTORY;

public class WordDocument extends Document {
    @Override
    public void open() {
        System.out.println("Abriendo el documento de Word");
    }
}
