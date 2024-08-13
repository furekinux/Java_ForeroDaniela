package ClaseAbstracta;

public class Cat extends Animal{
    
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void sound() {
        System.out.println(name+": Meow");
    }

    @Override
    public void sleep() {
        System.out.println(name+": zZZ u.u");
    }
}
