/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mapas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author camper
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        try{
            map.put("A", 1);
            map.put("B", 2);
            map.put("C", 3);
            
            System.out.println("Valor asociado con A: "+map.get("A"));
            
            System.out.println(map);
            map.remove("B");
            System.out.println(map);
        }catch(NullPointerException e){
            System.out.println("Por favor tener cuidado, accediste a una clave nula.");
        }catch(Exception e){
            System.out.println("Error Exception D: "+e);
        }
    }
    
}
