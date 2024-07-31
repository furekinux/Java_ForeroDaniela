package Polimorfismo;

/**
 *
 * @author camper
 */
public class Polimorfismo {
    public static void main(String[] args) {
        Gato cat = new Gato();
        Perro dog = new Perro();
        
        cat.hacerSonido();
        dog.hacerSonido();
    }
}
