package Game;

import java.util.ArrayList;
import java.util.List;

public class Weapon {
    
    private String nombre;
    private List<Enchantment> encantamientos;
    
    public Weapon(String nombre){
        this.nombre = nombre;
        this.encantamientos = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public List<Enchantment> getEncantamientos() {
        return encantamientos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEncantamientos(List<Enchantment> encantamientos) {
        this.encantamientos = encantamientos;
    }
    
}
