package Sets;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        try {
            set.add("A");
            set.add("B");
            set.add("C");
            set.add("D");
            set.add("E");
            
            System.out.println("¿El set contiene A? "+set.contains("A"));
            
            System.out.println(set);
            set.remove("B");
            System.out.println(set);
            
            System.out.println(set);
        }catch(NullPointerException e){
            System.out.println("Por favor tener cuidado, accediste a una clave nula.");
        }catch(Exception e){
            System.out.println("Error Exception D: "+e);
        }
    }
    
}
