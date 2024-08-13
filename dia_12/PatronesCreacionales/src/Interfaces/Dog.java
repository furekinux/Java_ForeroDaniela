package Interfaces;

public class Dog implements Animal{
    
    private String name;
    
    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }
    
    @Override
    public void sound() {
        System.out.println(name+": Woof");
    }

    @Override
    public void sleep() {
    }
    
}
