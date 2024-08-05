package Multiplicidad;
import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> books;
    
    public Author(){}

    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
    
    
    public Author(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }


    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book){
        books.add(book);
    }
    
    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
