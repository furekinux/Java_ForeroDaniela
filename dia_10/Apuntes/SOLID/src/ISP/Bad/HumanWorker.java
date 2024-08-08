package ISP.Bad;

public class HumanWorker implements Worker{

    @Override
    public void produce() {
        System.out.println("Auxilio, me explotan laboralmente </3");    
    }

    @Override
    public void eat() {
        System.out.println("Nom nom nom nom nom nom nom");
    }

    @Override
    public void cry() {
        System.out.println("<(TnT)> *llora*");
    }
    
}
