package Herencia;


/**
 *
 * @author camper
 */
public class Estudiante extends Usuario {
    private String codigoEstudiante;
    
    public Estudiante(String nombre, String documento, String codigoEstudiante){
        super(nombre, documento);
        this.codigoEstudiante = codigoEstudiante;
    }
}
