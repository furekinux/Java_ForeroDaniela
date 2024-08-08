package ISP.Bad;

public class RobotWorker implements Worker{

    @Override
    public void produce() {
        System.out.println("*Laburando*");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("ñ?");
    }

    @Override
    public void cry() {
        throw new UnsupportedOperationException("ñ?");
    }
    
}
