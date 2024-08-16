package Ejemplo_Implementacion.Sincronia.Correccion;

public class Counter {
    
    private int count=0;

    public Counter() {
    }
    
    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
   
}
