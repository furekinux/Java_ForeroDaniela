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
    private String nombres;
    private String apellidos;
    private String direccion;
    private String acudiente;
    private String celular;
    private String telefono;
    private String estado;
    private String riesgo;
    
    public camper(int id,String nombres,String apellidos,String direccion,String acudiente,
                String celular,String telefono,String estado,String riesgo)
    {
        this.id= serial++;
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
        this.nombres= null;
        this.apellidos=null;
        this.direccion=null;
        this.acudiente=null;
        this.celular=null;
        this.telefono=null;
        this.estado=null;
        this.riesgo=null;
    }

    
}
