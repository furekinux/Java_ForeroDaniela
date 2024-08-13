package ClaseAbstracta;

public class Dog extends Animal{
    
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name+": Woof");
    }

    @Override
    public void sleep() {
        System.out.println(name+": zZZ");
    }

}
