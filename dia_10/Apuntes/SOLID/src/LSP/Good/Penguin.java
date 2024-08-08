package LSP.Good;

public class Penguin extends Bird {

    @Override
    public void move() {
        slide();
    }
    
    public void slide(){
        System.out.println("Wiiiiii *se desliza :D*");
    }
}
