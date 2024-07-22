/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package campuslandserp;

import java.util.*;/*LIBRERÍA PARA HABILITAR INPUTS*/
/**
 *
 * @author camper
 */
public class CampusLandsERP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*menu menu = new menu();
        menu.setVisible(true);*/
        Scanner sc= new Scanner(System.in);
        String bold = "\033[0;1m";
        boolean start=true;
        boolean coord=true;
        boolean trainer=true;
        boolean camper=true;
        
        while (start==true){
            System.out.println(bold+"-----Bienvenido-----\n¿Quién desea ingresar?\n  1. Coordinacion\n  2. Trainer\n  3. Camper\n  4. Salir");
            int a = sc.nextInt();
            /*nextInt recibe numeros int, nextLine recibe Strings*/

            switch (a) { /*switch realiza revisión de los casos posibles(evitar usar el else if...)*/

                case 1 -> {
                    while(coord==true){
                        System.out.println("\n"+bold+"-----Coordinador-----\n  1. Asignación\n  2. Registrar\n  3. Cerrar sesión");
                        int rta = sc.nextInt();
                        switch(rta){
                            case 1 ->
                                System.out.println("Viste asignación\n");
                            case 2 ->
                                System.out.println("Viste Registrar\n");
                            case 3 -> {
                                System.out.println("Cerrando sesión\n");
                                coord=false;
                            }
                            default ->
                                System.out.println("No se reconoció la orden\n");
                        }
                    }
                }
                
                case 2 -> {
                    while(trainer==true){
                        System.out.println("\n"+bold+"-----Trainer-----\n  1. Ver listado\n  2. Ver salas\n  3. Cerrar sesión");
                        int rta = sc.nextInt();
                        switch (rta) {
                            case 1 ->
                                System.out.println("Viste listado\n");
                            case 2 ->
                                System.out.println("Viste salas\n");
                            case 3 -> {
                                System.out.println("Cerrando sesión\n");
                                trainer=false;
                            }
                            default ->
                                System.out.println("No se reconoció la orden\n");
                        }
                    }
                }
                
                case 3 -> {
                    while(camper==true){
                        System.out.println("\n"+bold+"-----Camper-----\n  1. Ver notas\n  2. Ver curso\n  3. Cerrar sesión");
                        int rta = sc.nextInt();
                        switch (rta) {
                            case 1 ->
                                System.out.println("Viste notas\n");
                            case 2 ->
                                System.out.println("Viste curso\n");
                            case 3 -> {
                                System.out.println("Cerrando sesión\n");
                                camper=false;
                            }
                            default ->
                                System.out.println("No se reconoció la orden\n");
                        }
                    }
                }
                
                case 4 -> {
                    System.out.println("Cerrando sesión\n");
                    start=false;
                }
                
                default ->
                    System.out.println("No se reconoció el usuario, vuelta a intentarlo\n");
            }
            /*RESETEAR LOS CICLOS*/
            coord=true;
            trainer=true;
            camper=true;
// TODO code application logic here
        }
    }
}
