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
public class PlayOffs extends Partido {
    String ronda;

    public PlayOffs(String equipoLocal,String equipoVisitante,int cestasLocal,int cestasVisitante,boolean estado,Date fechaPartido,String ronda){
        super(equipoLocal,equipoVisitante,cestasLocal,cestasVisitante,estado,fechaPartido);
        this.ronda = ronda;
    }
    
    public PlayOffs(String equipoLocal,String equipoVisitante,int cestasLocal,int cestasVisitante,String estado,String fechaPartido,String ronda){
        super(equipoLocal,equipoVisitante,cestasLocal,cestasVisitante,estado,fechaPartido);
        this.ronda = ronda;
    }
    
    public String getRonda(){
        return ronda;
    }
    public void setRonda(String ronda){
        this.ronda=ronda;
    }
    @Override
    public void partidoInfo(){
        System.out.println(blue+"\n@. *|+  Información del partido  +|* .@"+reset);
        System.out.println(red+"- PARTIDO PLAYOFF -");
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
