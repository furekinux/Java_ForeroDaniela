package Game;

import java.util.ArrayList;
import java.util.List;

public class Hero extends Character {
    private String clase;
    private List<Weapon> inventario;
    
    public Hero(){}

    public Hero(String clase, List<Weapon> inventario, String nombre, String rasgos, Object arma, String habilidad1, String habilidad2, String habilidadUlt) {
        super(nombre, rasgos, arma, habilidad1, habilidad2, habilidadUlt);
        this.clase = clase;
        this.inventario = new ArrayList<>();
    }

    public String getClase() {
        return clase;
    }

    public List<Weapon> getInventario() {
        return inventario;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setInventario(List<Weapon> inventario) {
        this.inventario = inventario;
    }

}
