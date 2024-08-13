package Interfaces;

public class Cat implements Animal{
    
    private String name;
    
    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println(name+": Meoww");
    }

    @Override
    public void sleep() {
    }
    
}
