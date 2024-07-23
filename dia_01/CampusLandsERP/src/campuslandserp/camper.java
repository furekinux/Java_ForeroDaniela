/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campuslandserp;
/**
 *
 * @author camper
 */
public class camper {
    private static int serial = 1;
    /*Como es estática se queda igual en la clase aunque creemos nuevos campers*/
    private int id;
    private String identificacion;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String acudiente;
    private String celular;
    private String telefono;
    private String estado;
    private String riesgo;
    
    public void camper(String identificacion,String nombres,String apellidos,String direccion,String acudiente,String celular,String telefono,String estado,String riesgo){
        this.id= serial++;
        this.identificacion= identificacion;
        this.nombres= nombres;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.acudiente=acudiente;
        this.celular=celular;
        this.telefono=telefono;
        this.estado=estado;
        this.riesgo=riesgo;
    }
    
    public camper( ){
        this.id= serial++;
        this.identificacion= null;
        this.nombres= null;
        this.apellidos=null;
        this.direccion=null;
        this.acudiente=null;
        this.celular=null;
        this.telefono=null;
        this.estado=null;
        this.riesgo=null;
    }

    
    // Setter y Getters
    public void setIdentificacion(String identificacion){
        this.identificacion= identificacion;
    }
    public String getIdentificacion(){
        return identificacion;
    }
    
    public void setNombres(String nombres){
        this.nombres= nombres;
    }
    public String getNombres(){
        return nombres;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos= apellidos;
    }
    public String getApellidos(){
        return apellidos;
    }
    
    public void setDireccion(String direccion){
        this.direccion= direccion;
    }
    public String getDireccion(){
        return direccion;
    }
    
    public void setAcudiente(String acudiente){
        this.acudiente= acudiente;
    }
    public String getAcudiente(){
        return acudiente;
    }
    
    public void setCelular(String celular){
        this.celular= celular;
    }
    public String getCelular(){
        return celular;
    }
    
    public void setTelefono(String telefono){
        this.telefono= telefono;
    }
    public String getTelefono(){
        return telefono;
    }
    
    public void setEstado(String estado){
        this.estado= estado;
    }
    public String getEstado(){
        return estado;
    }
    
    public void setRiesgo(String riesgo){
        this.riesgo= riesgo;
    }
    public String getRiesgo(){
        return riesgo;
    }
    // :D
    
    
    @Override
    public String toString() {
        return "Camper\n  Identificación: "+ id +
                "\n  Nombres: "+ nombres +
                "\n Apellidos: "+ apellidos +
                "\n Dirección"+direccion +
                "\n Acudiente: "+ acudiente +
                "\n Teléfono Celular: "+ celular +
                "\n Teléfono Fijo: "+ telefono +
                "\n Estado: "+ estado +
                "\n Riesgo: "+ riesgo;
    }
    
}
