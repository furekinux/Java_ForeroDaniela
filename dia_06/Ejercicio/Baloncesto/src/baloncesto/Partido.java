/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baloncesto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camper
 */
public class Partido {
    Scanner sc = new Scanner(System.in);
    
    final String reset = "\033[0m";
    final String blue = "\033[34m";
    final String green = "\033[32m";
    final String red = "\033[31m";
    final String purple = "\033[35m";
    
    protected String equipoLocal;
    protected String equipoVisitante;
    protected int cestasLocal;
    protected int cestasVisitante;
    protected boolean estado;
    protected Date fechaPartido;
    
    public Partido(){
    }
    public Partido(String equipoLocal,String equipoVisitante,int cestasLocal,int cestasVisitante,boolean estado,Date fechaPartido){
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasLocal = cestasLocal;
        this.cestasVisitante = cestasVisitante;
        this.estado = estado;
        this.fechaPartido = fechaPartido;
    }
    public Partido(String equipoLocal,String equipoVisitante,int cestasLocal,int cestasVisitante,String estado,String fechaPartido){
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasLocal = cestasLocal;
        this.cestasVisitante = cestasVisitante;
        if (estado.toLowerCase().equals("activo")){
            this.estado=true;
        }else{
            this.estado=false;
        }
        try {
            DateFormat sourceFormat = new SimpleDateFormat("yyyy/MM/dd");
            this.fechaPartido = sourceFormat.parse(fechaPartido);
        } catch (ParseException e1) {
            try {
                DateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd");
                this.fechaPartido = sourceFormat.parse(fechaPartido);
            } catch (ParseException e2) {
                Logger.getLogger(Partido.class.getName()).log(Level.SEVERE, null, e2);
            }
        }
    }
    
    public String getEquipoLocal(){
        return equipoLocal;
    }
    public void setEquipoLocal(String equipoLocal){
        this.equipoLocal=equipoLocal;
    }
    
    public String getEquipoVisitante(){
        return equipoVisitante;
    }
    public void setEquipoVisitante(String equipoVisitante){
        this.equipoVisitante=equipoVisitante;
    }
    
    public int getCestasLocal(){
        return cestasLocal;
    }
    public void setCestasLocal(int cestasLocal){
        this.cestasLocal=cestasLocal;
    }
    
    public int getCestasVisitante(){
        return cestasVisitante;
    }
    public void setCestasVisitante(int cestasVisitante){
        this.cestasVisitante=cestasVisitante;
    }
    
    public boolean getEstado(){
        return estado;
    }
    public void setEstado(boolean estado){
        this.estado=estado;
    }
    public void setEstado(String estado){
        if (estado.toLowerCase().equals("activo")){
            this.estado=true;
        }else{
            this.estado=false;
        }
    }
    
    public Date getFechaPartido(){
        return fechaPartido;
    }
    public void setFechaPartido(Date fechaPartido){
        this.fechaPartido = fechaPartido;
    }
    public void setFechaPartido(String fechaPartido){
        try {
            DateFormat sourceFormat = new SimpleDateFormat("yyyy/MM/dd");
            this.fechaPartido = sourceFormat.parse(fechaPartido);
        } catch (ParseException e1) {
            try {
                DateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd");
                this.fechaPartido = sourceFormat.parse(fechaPartido);
            } catch (ParseException e2) {
                Logger.getLogger(Partido.class.getName()).log(Level.SEVERE, null, e2);
            }
        }
    }
    
    
    public void equipoGanador(){
        System.out.println(blue+"\n@. *|+Equipo ganador del partido+|* .@"+reset);
        if(estado==true){
            System.out.println(red+"No disponible, el partido no ha finalizado.");
        }else{
            if(cestasLocal>cestasVisitante){
                System.out.println("El ganador es el equipo local, "+green+equipoLocal+"!");
            }else{
                System.out.println("El ganador es el equipo visitante, "+red+equipoVisitante+"!");
            }
        }
    }
    
    public void partidoResultados(){
        System.out.println(blue+"\n@. *|+  Resultados del partido  +|* .@"+reset);
        if(estado==true){
            System.out.println(red+"No disponible, el partido no ha finalizado.");
        }else{
            System.out.println("Equipo local: "+equipoLocal+green+"   Cestas: "+cestasLocal+reset+
               "\nEquipo visitante: "+equipoVisitante+red+"   Cestas: "+cestasVisitante+reset);
        }
    }
    
    public void partidoMarcador(){
        System.out.println(blue+"\n@.*|+ Marcador actual del partido +|*.@"+reset);
        System.out.println(green+"Equipo local: "+equipoLocal+"   Cestas: "+cestasLocal+reset+
               red+"\nEquipo visitante: "+equipoVisitante+"   Cestas: "+cestasVisitante+reset);
    }
    
    public void partidoInfo(){
        System.out.println(blue+"\n@. *|+  Información del partido  +|* .@"+reset);
        System.out.println("Fecha del partido: "+fechaPartido);
        if (estado == true){
            System.out.println(green+"El partido se encuentra activo."+reset);
        }else{
            System.out.println(red+"El partido no se encuentra activo."+reset);
        }
        System.out.println(blue+"\nEnfrentamiento entre:"+reset);
        System.out.println("Equipo Local: "+green+equipoLocal+reset);
        System.out.println("      Cestas: "+cestasLocal);
        System.out.println("\nEquipo Visitante: "+red+equipoVisitante);
        System.out.println("      Cestas: "+cestasVisitante);
    }
    
    public void verInformacion(){
        System.out.println(purple+"\n@. *|+  Partido Corriente  +|* .@"+reset);
        System.out.println("¿Qué tipo de información quiere visualizar?");
        System.out.println("""
                           1. Informaci\u00f3n general de partido
                           2. Marcador actual de partido
                           3. Resultados de partido
                           4. Equipo Ganador
                           0. Volver""");
        int choice = sc.nextInt();
        switch(choice){
            case 1->{
                partidoInfo();
            }case 2->{
                partidoMarcador();
            }case 3->{
                partidoResultados();
            }case 4->{
                equipoGanador();
            }default->{
                System.out.println("\n"+red+"Volviendo...\n\n"+reset);
            }
        }
    }
    
    public void modificarInformacion(){
        System.out.println(blue+"\n@. *|+  Modificar Info Partido  +|* .@"+reset);
        System.out.println("¿Qué tipo de información quiere modificar?");
        System.out.println("""
                           1. Equipo Local
                           2. Equipo Visitante
                           3. Cestas del Equipo local
                           4. Cestas del Equipo visitante
                           5. Fecha del partido
                           0. Volver""");
        int choice = sc.nextInt();
        switch(choice){
            case 1->{
                System.out.println("Ingrese el nuevo equipo local, el actual es: "+getEquipoLocal());
                String input = sc.nextLine();
                input = sc.nextLine();
                setEquipoLocal(input);
                System.out.println(green+"Se ingresó el nuevo equipo local: "+getEquipoLocal());
                
            }case 2->{
                System.out.println("Ingrese el nuevo equipo local, el actual es: "+getEquipoVisitante());
                String input = sc.nextLine();
                input = sc.nextLine();
                setEquipoVisitante(input);
                System.out.println(green+"Se ingresó el nuevo equipo local: "+getEquipoVisitante());
                
            }case 3->{
                System.out.println("Ingrese el numero de cestas del equipo local, las actuales son: "+getCestasLocal());
                int input = sc.nextInt();
                input = sc.nextInt();
                setCestasLocal(input);
                System.out.println(green+"Se ingresó el numero de cestas del equipo local: "+getCestasLocal());
                
            }case 4->{
                System.out.println("Ingrese el numero de cestas del equipo visitante, las actuales son: "+getCestasVisitante());
                int input = sc.nextInt();
                input = sc.nextInt();
                setCestasVisitante(input);
                System.out.println(green+"Se ingresó el numero de cestas del equipo visitante: "+getCestasVisitante());
            
            }case 5->{
                System.out.println("Ingrese la nueva fecha del partido, la actual es: "+getFechaPartido());
                String input = sc.nextLine();
                input = sc.nextLine();
                setFechaPartido(input);
                System.out.println(green+"Se ingresó la nueva fecha del partido: "+getFechaPartido());
                
            }default->{
                System.out.println("\n"+red+"Volviendo...\n\n"+reset);
            }
        }
    }

    public void finalizarPartido(){
        System.out.println(blue+"\n@. *|+   Finalizar Partido   +|* .@"+reset);
        if(getCestasLocal()==getCestasVisitante()){
            System.out.println(red+"El partido no puede ser finalizado si no existe algún equipo vencedor");
            System.out.println(red+"Marcador actual: "+getCestasLocal()+"-"+getCestasVisitante());
        }else{
            System.out.println(green+"Se ha finalizado el partido correctamente"+reset);
        }
    }
}
