package ISP.Good;

public class HumanWorker implements Worker,Eater{

    @Override
    public void produce() {
        System.out.println("*Trabaja bien aesthetic*");
    }

    @Override
    public void eat() {
        System.out.println("*Come* nom nom nom");
    }
    
}
