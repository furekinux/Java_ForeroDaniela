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
        Scanner sc= new Scanner(System.in);
        boolean start=true;
        
        while (start=true){
        System.out.println("-----Bienvenido-----\n¿Quién desea ingresar?\n  1. Coordinacion\n  2. Trainer\n  3. Camper");
        int a = sc.nextInt();
        /*nextInt recibe numeros int, nextLine recibe Strings*/
        
        switch (a) {
        /*switch realiza revisión de los casos posibles(evitar usar el else if...)*/
            case 1:
                System.out.println("-----Coordinador-----\n  1.Asignación\n  2.Cerrar sesión");
                int rta = sc.nextInt();
                switch(rta){
                    case 1:
                        System.out.println("Asignación");
                    case 2:
                        System.out.println("Cerrando sesión");
                        break;
                    default: {
                        System.out.println("No se reconoció el usuario");
                        break;
                    }
                }
            case 2:
                System.out.println("Hola Trainer");
            case 3:
                System.out.println("Hola Trainer");
            default: {
                System.out.println("No se reconoció el usuario");
            }
        }
        // TODO code application logic here
            }
        }
}
