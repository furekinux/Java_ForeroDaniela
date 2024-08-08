package LSP.Good;

public class FlyingBird extends Bird{

    @Override
    public void move() {
        fly();
    }
    
    public void fly(){
        System.out.println("*Se va volando :D*");
    }
}
