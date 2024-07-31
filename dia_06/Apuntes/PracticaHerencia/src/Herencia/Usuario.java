package Herencia;

/**
 *
 * @author camper
 */
public class Usuario {
    protected String nombre;
    protected String documento;
    
    public Usuario(){}
    public Usuario(String nombre,String documento){
        this.nombre = nombre;
        this.documento = documento;
    }


    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    public String getDocumento(){
        return documento;
    }
    public void setDocumento(String documento){
        this.documento = documento;
    }
}
