package Game;

public class Enchantment {
    private String efectoActivar;
    private String efectoAplicar;
    
    public Enchantment(){}

    public Enchantment(String efectoActivar, String efectoAplicar) {
        this.efectoActivar = efectoActivar;
        this.efectoAplicar = efectoAplicar;
    }

    public String getEfectoActivar() {
        return efectoActivar;
    }

    public String getEfectoAplicar() {
        return efectoAplicar;
    }

    public void setEfectoActivar(String efectoActivar) {
        this.efectoActivar = efectoActivar;
    }

    public void setEfectoAplicar(String efectoAplicar) {
        this.efectoAplicar = efectoAplicar;
    }
    
}
