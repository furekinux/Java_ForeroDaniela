/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baloncesto;

import java.util.Date;

/**
 *
 * @author camper
 */
public class Liga extends Partido {
    int jornada;
    
    public Liga(String equipoLocal,String equipoVisitante,int cestasLocal,int cestasVisitante,boolean estado,Date fechaPartido,int jornada){
        super(equipoLocal,equipoVisitante,cestasLocal,cestasVisitante,estado,fechaPartido);
        this.jornada = jornada;
    }
    
    public Liga(String equipoLocal,String equipoVisitante,int cestasLocal,int cestasVisitante,String estado,String fechaPartido,int jornada){
        super(equipoLocal,equipoVisitante,cestasLocal,cestasVisitante,estado,fechaPartido);
        this.jornada = jornada;
    }
    
    public int getJornada(){
        return jornada;
    }
    public void setJornada(int jornada){
        this.jornada=jornada;
    }
    
    @Override
    public void partidoInfo(){
        System.out.println(blue+"\n@. *|+  Información del partido  +|* .@"+reset);
        System.out.println(red+"- PARTIDO DE LIGA -");
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
}
