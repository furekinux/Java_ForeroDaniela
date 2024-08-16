package Ejemplo_Implementacion.Sincronia.Correccion;

public class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public CounterThread(Ejemplo_Implementacion.Sincronia.Falla.Counter counter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void run() {
        for (int i=0; i<1000; i++){
            counter.increment();
        }
    }
    
    
}
