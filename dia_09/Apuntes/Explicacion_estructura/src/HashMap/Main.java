package HashMap;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        /*HashMap<>(capacidad inicial[default:16], factor de carga[default:0.75]);*/
        
        try {
            /*NO SE ELIMINA, quita la referencia :3*/
            /*NO SE AGREGA, se referencia :3*/
            hashMap.put("A",1);
            hashMap.put("B",2);
            hashMap.put("C",3);
            hashMap.put("D",4);
            
            System.out.println("Valor asociado a A: "+hashMap.get("A"));
            
            System.out.println(hashMap);
            hashMap.remove("B");
            System.out.println(hashMap.get("B"));
            System.out.println(hashMap);
            
            System.out.println(hashMap.get("E"));
        }catch(NullPointerException e){
            System.out.println("Por favor tener cuidado, accediste a una clave nula.");        
        }catch(Exception e){
            System.out.println("Error Exception D: "+e);
        }
    }
    
}
