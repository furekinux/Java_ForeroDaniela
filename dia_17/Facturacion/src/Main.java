
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean menu = true;
        int a;
        while(menu){
            System.out.println("----- Menu Principal -----\n 1. Agregar productos a la factura\n 2. Calcular total\n 3. Aplicar descuentos\n 0. Salir");
            a = sc.nextInt();
            switch (a) {
                case 1->{
                
                }
                
                default->{
                    System.out.println("\n------ Vuelva pronto ------");
                    menu=false;
                }
            }
        }

    }
    
}