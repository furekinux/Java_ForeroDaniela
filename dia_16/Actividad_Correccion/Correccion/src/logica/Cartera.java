package logica;

import java.util.ArrayList;
import java.util.List;

public class Cartera implements PatronCartera{
    
    private String anho;
    private List<Tarjeta> tarjetas;

    public Cartera(String anho, List<Tarjeta> Tarjetas) {
        this.anho = anho;
        this.tarjetas = Tarjetas;
    }
    public Cartera(String anho) {
        this.anho = anho;
        tarjetas = new ArrayList<>();
    }

    public String getAnho() {
        return anho;
    }
    public void setAnho(String anho) {
        this.anho = anho;
    }
    
    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }
    public void setTarjetas(List<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }
    
    @Override
    public void imprimirListaDeTarjetas() {
        System.out.println("******* Balance del año "+getAnho()+" *******");
        for(Tarjeta tarjeta:tarjetas){
            System.out.println(tarjeta.info());
        }
    }

    @Override
    public void agregarTarjeta(Tarjeta t) {
        tarjetas.add(t);
    }
    
}
