
import logica.Cliente;
import logica.Factura;
import logica.Producto;

/*import java.util.Scanner;*/

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan", "Carlos", "999999999");
        
        Producto producto1 = new Producto("Un zapato(derecho)", 999.99);
        Producto producto2 = new Producto("Un zapato(izquierdo)", 25.99);

        Factura factura1 = new Factura(cliente1);
        
        factura1.agregarProducto(producto1);
        factura1.agregarProducto(producto2);
        
        factura1.listarProducto();
                
        /*Scanner sc = new Scanner(System.in);
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
        }*/

    }
    
}