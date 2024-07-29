package hospital;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author camper
 */
public class Main {
    
    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean menu = true;
        boolean menu_secundario = true;
        Scanner sc = new Scanner(System.in);
        int a;
        
        while(menu){
            System.out.println("------ Menú Principal ------");
            System.out.println("Bienvenido, ¿Qué acción desea realizar?");
            System.out.println("1. Crear/Ingresar información\n2. Leer/Ver información\n3. Actualizar/Cambiar información\n4. Borrar datos específicos\n5. Salir");
            a = sc.nextInt();
            switch (a) {
                case 1->{
                    while(menu_secundario){
                        System.out.println("--------- Menú Crear/Ingresar ---------\n¿Dónde va a realizar la acción?");
                        System.out.println("1. Nuevo Hospital\n2. Nuevo Departamento\n3. Nuevo Pabellón\n4. Nuevo Personal\n5. Nuevo Paciente\n6. Nuevo equipo");
                        a = sc.nextInt();
                        switch(a){
                            case 1->{
                                String nombre_hospital;
                                String direccion_hospital;
                                System.out.println("\n------ Ingrese los siguientes datos para el nuevo hospital ------");
                                
                                System.out.println("Nombre del Hospital:");
                                nombre_hospital=sc.nextLine();
                                
                                System.out.println("Dirección del Hospital:");
                                direccion_hospital=sc.nextLine();
                                
                                Hospital hospital = new Hospital();
                            
                            }case 2->{
                                
                            }case 3 ->{
                                System.out.println("hi");

                            }default ->{
                                System.out.println("Saliendo");
                                menu_secundario=false;
                            }
                            
                        }
                    }
                    menu_secundario=true;
                }case 2->{
                    while(menu_secundario){
                        System.out.println("--------- Menú Ver/Leer ---------\n¿Dónde va a realizar la acción?");
                        System.out.println("1. Hospital(es)\n2. Departamento(es)\n3. Pabellón(es)\n4. Personal(es)\n5. Paciente(s)\n6. Equipo(s)");
                        a = sc.nextInt();
                        switch(a){
                            case 1->{
                                
                                
                                
                            }
                            default ->{
                                System.out.println("Saliendo");
                                menu_secundario=false;
                            }
                        }
                    }
                    menu_secundario=true;
                }case 3->{
                    while(menu_secundario){
                        System.out.println("--------- Menú Borrar/Eliminar ---------\n¿Dónde va a realizar la acción?");
                        System.out.println("1. Hospital\n2. Departamento\n3. Nuevo Pabellón\n4. Nuevo Personal\n5. Nuevo Paciente\n6. Nuevo equipo");
                        a = sc.nextInt();
                        switch(a){
                            case 1->{
                            
                            } default->{
                                System.out.println("Saliendo");
                                menu_secundario=false;
                            }
                        }
                    }
                    menu_secundario=true;
                }case 4->{
                    while(menu_secundario){
                        System.out.println("--------- Menú Actualizar/Cambiar ---------\n¿Dónde va a realizar la acción?");
                        System.out.println("1. Hospital\n2. Nuevo Departamento\n3. Nuevo Pabellón\n4. Nuevo Personal\n5. Nuevo Paciente\n6. Nuevo equipo");
                        a = sc.nextInt();
                        switch(a){
                            case 1->{
                            
                            } default->{
                                System.out.println("Saliendo");
                                menu_secundario=false;
                            }
                        }
                    }
                    menu_secundario=true;
                }
                default->{
                    System.out.println("\n--------- Cerrando la sesión ---------");
                    menu=false;
                }
            }
            a = 0;
        }
    }
    
}
