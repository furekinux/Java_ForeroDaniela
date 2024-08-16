/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia12;

/**
 *
 * @author DZ
 */
public class Atleta implements Runnable {
    private int numero;
    private boolean esUltimo;

    public Atleta(int numero, boolean esUltimo) {
        this.numero = numero;
        this.esUltimo = esUltimo;
    }

    @Override
    public void run() {
        synchronized (Carrera.testigo) {
            try {
                while (numero != Carrera.turno) {
                    Carrera.testigo.wait();
                }

                System.out.println("Atleta " + numero + " comienza a correr...");
                
                long tiempoInicio = System.currentTimeMillis();
                System.out.println(tiempoInicio);
                Thread.sleep((long) (Math.random() * 2000 + 9000));

                long tiempoFin = System.currentTimeMillis();
                System.out.println(tiempoFin);
                System.out.println("Atleta " + numero + " terminó en " + 
                    (tiempoFin - tiempoInicio) / 1000.0 + " segundos.");

                Carrera.turno++;

                if (!esUltimo) {
                    Carrera.testigo.notifyAll(); 
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
