package ClaseAbstracta;

public class Main {

    public static void main(String[] args) {
        
        Dog dog= new Dog("Perrito Abstracto");
    
        dog.sleep();
        dog.sound();
        
        Cat cat= new Cat("Michi Abstracto");
        cat.sleep();
        cat.sound();
        
    }
    
}
