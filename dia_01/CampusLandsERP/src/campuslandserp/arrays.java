/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campuslandserp;
import java.util.ArrayList;

/**
 *
 * @author camper
 */
public class arrays {
    public static Object[] CampersArray;
    
    public static void listadd(Object item){
        CampersArray[CampersArray.length+1]=item;
    }
    
    public String getcampers(){
        String lista_campers="";
        for (Object camper : CampersArray) {
            lista_campers=lista_campers+" "+camper;
        }
        return lista_campers;
    } 

}