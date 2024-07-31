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
        System.out.println(purple+"\n@. *|+  Partido PlayOff  +|* .@"+reset);
        System.out.println("¿Qué tipo de información quiere visualizar?");
        System.out.println("""
                           1. Informaci\u00f3n general de partido
                           2. Marcador actual de partido
                           3. Resultados de partido
                           4. Equipo Ganador
                           0. Volver""");
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
                System.out.println("\n"+red+"Volviendo...\n\n"+reset);
        }
    }
    
    @Override
    public void modificarInformacion(){
        System.out.println(blue+"\n@. *|+  Modificar Info Partido  +|* .@"+reset);
        System.out.println("¿Qué tipo de información quiere modificar?");
        System.out.println("""
                           1. Equipo Local
                           2. Equipo Visitante
                           3. Cestas del Equipo local
                           4. Cestas del Equipo visitante
                           5. Fecha del partido
                           6. Jornada de Liga
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
                
            }case 6->{
                System.out.println("Ingrese la jornada del partido de liga, la actual es: "+getRonda());
                System.out.println("Disponible: 'Octavos', 'Cuartos','Final'");
                String input = sc.nextLine();
                input = sc.nextLine();
                if ("Octavos".equals(input) || "Cuartos".equals(input) || "Final".equals(input)){
                    setRonda(input);
                    System.out.println(green+"Se ingresó la nueva fecha del partido: "+getRonda());
                }else{
                    System.out.println(red+"No se reconoció el tipo de ronda ingresada: "+input);
                }
            }default->{
                System.out.println("\n"+red+"Volviendo...\n\n"+reset);
            }
        }
    }
}
