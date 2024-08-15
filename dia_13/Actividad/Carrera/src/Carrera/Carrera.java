package Carrera;

import java.util.Calendar;
import java.util.Locale;

public class Carrera {

    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Juan");
        Atleta atleta2 = new Atleta("Pepe");
        Atleta atleta3 = new Atleta("Florinda");
        Atleta atleta4 = new Atleta("Elsa");
        
        
        System.out.println("El atleta "+atleta1.getName()+" tomó "+" segundos en recorrer la pistas");
    }
    
}
