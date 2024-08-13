package Game;

public class Character {

    private String nombre;
    private String rasgos;
    private Object arma;
    private String habilidad1;
    private String habilidad2;
    private String habilidadUlt;
    
    public Character(){}

    public Character(String nombre, String rasgos, Object arma, String habilidad1, String habilidad2, String habilidadUlt) {
        this.nombre = nombre;
        this.rasgos = rasgos;
        this.arma = arma;
        this.habilidad1 = habilidad1;
        this.habilidad2 = habilidad2;
        this.habilidadUlt = habilidadUlt;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRasgos() {
        return rasgos;
    }

    public String getHabilidad1() {
        return habilidad1;
    }

    public String getHabilidad2() {
        return habilidad2;
    }

    public String getHabilidadUlt() {
        return habilidadUlt;
    }

    public Object getArma() {
        return arma;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRasgos(String rasgos) {
        this.rasgos = rasgos;
    }

    public void setHabilidad1(String habilidad1) {
        this.habilidad1 = habilidad1;
    }

    public void setHabilidad2(String habilidad2) {
        this.habilidad2 = habilidad2;
    }

    public void setHabilidadUlt(String habilidadUlt) {
        this.habilidadUlt = habilidadUlt;
    }

    public void setArma(Object arma) {
        this.arma = arma;
    }
    
    public void activarArma(){
    
    }
    
    public void usarArma(){
    
    }
    
    public void desactivarArma(){
    
    }
}
