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
    
    @Override
    public void verInformacion(){
        System.out.println(blue+"\n@. *|+  Partido PlayOff  +|* .@"+reset);
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
