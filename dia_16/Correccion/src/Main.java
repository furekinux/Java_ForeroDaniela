import java.util.Scanner;
import logica.Cartera;
import persistencia.LecturaEscritura;

public class Main {
    
    public static void main(String[] args) {
        /*Cartera b1= new Cartera("2024");
        b1.agregarTarjeta(new Joven("000-0005-001",20000,"Mayo"));
        b1.agregarTarjeta(new Nomina("000-0005-002",110000,"Mayo")); 
        b1.agregarTarjeta(new Visa("000-0005-003",90000,"Mayo")); 
        b1.agregarTarjeta(new Joven("000-0005-004",22000,"Mayo")); 
        b1.agregarTarjeta(new Joven("000-0006-005",35000,"Junio"));
        b1.agregarTarjeta(new Nomina("000-0006-006",100000,"Junio")); 
        b1.agregarTarjeta(new Visa("000-0006-007",85000,"Junio")); 
        b1.agregarTarjeta(new Joven("000-0006-008",28000,"Junio")); 
        b1.imprimirListaDeTarjetas();*/
        /*LecturaEscritura le = new LecturaEscritura("Enero");
        le.leerTarjetas();
        le.setFileName("Febrero");
        le.leerTarjetas();
        le.setFileName("Marzo");
        le.leerTarjetas();
        le.setFileName("Abril");
        le.leerTarjetas();
        le.setFileName("Mayo");
        le.leerTarjetas();
        le.setFileName("Junio");
        le.leerTarjetas();
        le.setFileName("Julio");
        le.leerTarjetas();
        le.setFileName("Agosto");
        le.leerTarjetas();
        le.setFileName("Septiembre");
        le.leerTarjetas();
        le.setFileName("Octubre");
        le.leerTarjetas();
        le.setFileName("Noviembre");
        le.leerTarjetas();
        le.setFileName("Diciembre");
        le.leerTarjetas();
        le.escribirTarjetas(le.getList());*/
        int opcion = 3;
        do{
            System.out.println("""
                               1. Consulta general de todas las tarjetas
                               2. Consulta de tarjetas por mes
                               3. Salir
                               Digite una opci\u00f3n del men\u00fa""");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            switch(opcion){
                case 1 -> { LecturaEscritura le = new LecturaEscritura("Enero");
                            le.leerTarjetas();
                            le.setFileName("Febrero");
                            le.leerTarjetas();
                            le.setFileName("Marzo");
                            le.leerTarjetas();
                            le.setFileName("Abril");
                            le.leerTarjetas();
                            le.setFileName("Mayo");
                            le.leerTarjetas();
                            le.setFileName("Junio");
                            le.leerTarjetas();
                            le.setFileName("Julio");
                            le.leerTarjetas();
                            le.setFileName("Agosto");
                            le.leerTarjetas();
                            le.setFileName("Septiembre");
                            le.leerTarjetas();
                            le.setFileName("Octubre");
                            le.leerTarjetas();
                            le.setFileName("Noviembre");
                            le.leerTarjetas();
                            le.setFileName("Diciembre");
                            le.leerTarjetas();
                            le.escribirTarjetas(le.getList());
                            Cartera b1= new Cartera("2024");
                            b1.setTarjetas(le.getList());
                            b1.imprimirListaDeTarjetas();
                }
                case 2 -> {System.out.println("Digite el mes que desea consultar: ");
                            String mes = sc.next();
                            consultarTarjetaMes(mes.toLowerCase());
                }
                default -> {System.out.println("Digite una opción correcta del Menú");
                }
            }
        }while(opcion!=3);
    }  
    
    public static void consultarTarjetaMes(String mes){
        LecturaEscritura l = new LecturaEscritura(mes);
        l.leerTarjetas();
        Cartera c= new Cartera("2024");
        c.setTarjetas(l.getList());
        c.imprimirListaDeTarjetas();
    }
}