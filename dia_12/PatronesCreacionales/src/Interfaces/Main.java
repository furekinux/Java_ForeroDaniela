package Interfaces;

public class Main {

    public static void main(String[] args) {
        Dog dog= new Dog("Perrito de Interfáz");
    
        dog.sleep();
        dog.sound();
        
        Cat cat= new Cat("Michi de Interfáz");
        cat.sleep();
        cat.sound();
    }
    
}
