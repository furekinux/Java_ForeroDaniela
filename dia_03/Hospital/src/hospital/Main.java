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
        
        /*ConnecToServer cn=new ConnecToServer();
        Statement st;
        ResultSet rs;
        try {
            st=cn.con.createStatement();
            rs=st.executeQuery("select * from hospital;");
            while (rs.next()) {                
                System.out.println(rs.getInt("id")+" "+rs.getString("nombre"));
            }
            cn.con.close();
        } catch (SQLException e) {}*/
        
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
                                System.out.println("------ Ingrese los siguientes datos para el nuevo hospital ------");
                                
                                System.out.println("Nombre del Hospital:");
                                String nombre_hospital=sc.nextLine();
                                System.out.println("\nNombre del Hospital:");
                                String direccion_hospital=sc.nextLine();
                                
                                Hospital hospital = new hospital();
                                
                                hospital.hospital_create(nombre_hospital, direccion_hospital);
                                hospital.hospital_read_especific(nombre_hospital, direccion_hospital);
                            
                            }case 2->{
                                
                            }case 3 ->
                                System.out.println("hi");
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
                                
                                ConnecToServer cn=new ConnecToServer();
                                Statement st;
                                ResultSet rs;
                                try {
                                    
                                    st=cn.con.createStatement();
                                    rs=st.executeQuery("select * from hospital;");
                                    while (rs.next()) {                
                                        System.out.println(rs.getInt("id")+" "+rs.getString("nombre"));
                                    }
                                    cn.con.close();
                                } catch (SQLException e) {}
                                
                            }
                            default ->
                                System.out.println("Hi");
                        }
                    }
                    menu_secundario=true;
                }case 3->{
                    while(menu_secundario){
                        System.out.println("--------- Menú Actualizar/Cambiar ---------\n¿Dónde va a realizar la acción?");
                        System.out.println("1. Hospital\n2. Departamento\n3. Nuevo Pabellón\n4. Nuevo Personal\n5. Nuevo Paciente\n6. Nuevo equipo");
                        a = sc.nextInt();
                    }
                    menu_secundario=true;
                }case 4->{
                    while(menu_secundario){
                        System.out.println("--------- Menú Actualizar/Cambiar ---------\n¿Dónde va a realizar la acción?");
                        System.out.println("1. Hospital\n2. Nuevo Departamento\n3. Nuevo Pabellón\n4. Nuevo Personal\n5. Nuevo Paciente\n6. Nuevo equipo");
                    }
                    menu_secundario=true;                }
                default->{
                    System.out.println("\n--------- Cerrando la sesión ---------");
                    menu=false;
                }
            }
            a = 0;
        }
    }
    
}
