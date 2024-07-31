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
    
    @Override
    public void verInformacion(){
        System.out.println(blue+"\n@. *|+  Partido de Liga  +|* .@"+reset);
        System.out.println("¿Qué tipo de información quiere visualizar?");
        System.out.println("1. Información general de partido\n2. Marcador actual de partido\n3. Resultados de partido\n4. Equipo Ganador\n0. Volver");
        int choice = sc.nextInt();
        switch(choice){
            case 1->
                partidoInfo();
            case 2->
                partidoMarcador();
            case 3->
                partidoResultados();
            case 4->
                equipoGanador();
            default->
                System.out.println("\n"+red+"Volviendo al Menú principal...\n\n"+reset);
        }
    }
}
