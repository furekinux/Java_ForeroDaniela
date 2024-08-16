package Ejemplo_Implementacion.ExtenderThread;

public class MyThread extends Thread {
    @Override
    public void run(){
        for (int i = 0; i<5; i++){
            System.out.println("Hilo"+this.getName()+": Iteración "+i);
            try{
                Thread.sleep(1000); // Pausa el hilo por un segundo
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
