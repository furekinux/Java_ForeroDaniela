package FACTORY;

public class PDFDocument extends Document {
    @Override
    public void open() {
        System.out.println("Abriendo el documento PDF.");
    }
}
