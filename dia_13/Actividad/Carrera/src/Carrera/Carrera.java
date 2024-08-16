package Carrera;

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
