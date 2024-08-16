/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia12;

/**
 *
 * @author DZ
 */
public class Carrera {
    static final Object testigo = new Object();
    private static final int NUM_ATLETAS = 4;
    static int turno = 1;

    public static void main(String[] args) {
        Atleta[] atletas = new Atleta[NUM_ATLETAS];

        synchronized (testigo) {
            System.out.println("El primer atleta se prepara para comenzar...");
        }

        for (int i = 0; i < NUM_ATLETAS; i++) {
            atletas[i] = new Atleta(i + 1, i == NUM_ATLETAS - 1);
            new Thread(atletas[i]).start();
        }

        synchronized (testigo) {
            testigo.notify();
        }
    }
}
