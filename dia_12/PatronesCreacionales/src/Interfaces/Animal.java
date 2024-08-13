package Interfaces;

public interface Animal {
    
    public void sound();
    
    default void sleep(){
        System.out.println("Durmiendo...");
    }
    
}
