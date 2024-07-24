/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campuslandserp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camper
 */
public class arrays {
    List<Object> Campers;

    public arrays()
    {
        Campers=new ArrayList<>();
    }
    
    public void listadd(Object item){
        Campers.add(item);
    }
    
    public String getcampers(){
        String lista_campers="";
        for (Object camper : Campers) {
            lista_campers=camper+" "+lista_campers;
        }
        return lista_campers;
    }

    public int getSize(){
        int size = Campers.size();
        return size;
    }
    
    @Override
    public String toString() {
        String lista_campers="";
        for (Object camper : Campers) {
            lista_campers=lista_campers+" "+camper;
        }
        return lista_campers;
    }
}