/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author camper
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        conectarBBDD conectar = new conectarBBDD();
        conectar.conectar();
        
        boolean menu = true;
        Scanner sc = new Scanner(System.in);
        
        while(menu==true){
            /*Scanner sc = new Scanner();*/
            System.out.println("------ Menú Principal ------");
            System.out.println("Bienvenido, ¿Qué acción desea realizar?");
            int a = sc.nextInt();
            switch (a) {
                case 1->
                    System.out.println("--------- Menú Principal ---------\nBienvenido, ¿Qué acción desea realizar?");
                
                default->
                    System.out.println("--- No se reconoció la solucitud ---\n");
            }
        }
    }
    
}
