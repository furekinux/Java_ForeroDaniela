package Multiplicidad;

public class ExplicacionClases {

    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling");
        Book book1 = new Book ("Harry Potter and the Sorcerer's Stone");
        Book book2 = new Book ("Harry Potter and the Chamber of Secrets");
        
        author.addBook(book1);
        author.addBook(book2);
        
        System.out.println("Author: "+author.getName());
        
        for (int i=0; i<author.getBooks().size();i++){
            System.out.println("Book #"+(i+1)+" "+author.getBooks().get(i));
        }
    }
    
}
