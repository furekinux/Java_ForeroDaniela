package hospital;
import java.util.Scanner;

/**
 *
 * @author Daniela Forero Ballén 1.142.714.225
 */
public class Main {

    public static void main(String[] args) {
        
        boolean menu = true;
        boolean menu_secundario = true;
        Scanner sc = new Scanner(System.in);
        int a;
        
        while(menu){
            System.out.println("------------- Menú Principal -------------");
            System.out.println("Bienvenido, ¿Qué acción desea realizar?");
            System.out.println("1. Crear/Ingresar información\n2. Leer/Ver información\n3. Actualizar/Cambiar información\n4. Borrar datos específicos\n5. Salir");
            
            a = sc.nextInt();
            switch (a) {
                case 1->{
                    while(menu_secundario){
                        System.out.println("\n------------- Menú Crear/Ingresar -------------\n¿Dónde va a realizar la acción?");
                        System.out.println("1. Nuevo Hospital\n2. Nuevo Departamento\n3. Nuevo Pabellón\n4. Nuevo Personal\n5. Nuevo Paciente\n6. Nuevo equipo");
                        a = sc.nextInt();
                        switch(a){
                            case 1->{
                                
                                Hospital hospital = new Hospital();
                                hospital.hospital_create();
                            
                            }case 2->{
                                /*Departamento departamento = new Departamento();
                                departamento.departamento_create();*/
                                
                            }case 3->{
                                /*Pabellon pabellon = new Pabellon();
                                pabellon.pabellon_create();*/
                                
                            }case 4->{
                                /*Personal personal = new Personal();
                                personal.personal_create();*/
                                
                            }case 5->{
                                /*Paciente paciente = new Paciente();
                                paciente.paciente_create();*/
                                
                            }case 6->{
                                /*Equipos equipos = new Equipos();
                                equipos.equipos_create();*/
                               
                            }default ->{
                                System.out.println("\nVolviendo...\n");
                                menu_secundario=false;
                            }
                            
                        }
                    }
                    menu_secundario=true;
                }case 2->{
                    while(menu_secundario){
                        System.out.println("\n------------- Menú Ver/Leer -------------\n¿Dónde va a realizar la acción?");
                        System.out.println("1. Hospital(es)\n2. Departamento(es)\n3. Pabellón(es)\n4. Personal(es)\n5. Paciente(s)\n6. Equipo(s)");
                        a = sc.nextInt();
                        switch(a){
                            case 1->{
                                Hospital hospital = new Hospital();
                                hospital.hospital_read();

                            }case 2->{
                                Departamento departamento = new Departamento();
                                departamento.departamento_read();
                                
                            }case 3->{
                                Pabellon pabellon = new Pabellon();
                                pabellon.pabellon_read();
                                
                            }case 4->{
                                /*Personal personal = new Personal();
                                personal.personal_read();*/
                                
                            }case 5->{
                                /*Paciente paciente = new Paciente();
                                paciente.paciente_read();*/
                                
                            }case 6->{
                                /*Equipos equipos = new Equipos();
                                equipos.equipos_read();*/
                                
                            }default ->{
                                System.out.println("\nVolviendo...\n");
                                menu_secundario=false;
                            }
                        }
                    }
                    menu_secundario=true;
                }case 3->{
                    while(menu_secundario){
                        System.out.println("\n------------- Menú Actualizar/Cambiar -------------\n¿Dónde va a realizar la acción?");
                        System.out.println("1. Hospital\n2. Departamento\n3. Pabellón\n4. Personal\n5. Paciente\n6. Equipo");
                        a = sc.nextInt();
                        switch(a){
                            case 1->{
                                /*Hospital hospital = new Hospital();
                                hospital.hospital_update();*/

                            }case 2->{
                                /*Departamento departamento = new Departamento();
                                departamento.departamento_update();*/
                                
                            }case 3->{
                                /*Pabellon pabellon = new Pabellon();
                                pabellon.pabellon_update();*/
                                
                            }case 4->{
                                /*Personal personal = new Personal();
                                personal.personal_update();*/
                                
                            }case 5->{
                                /*Paciente paciente = new Paciente();
                                paciente.paciente_update();*/
                                
                            }case 6->{
                                /*Equipos equipos = new Equipos();
                                equipos.equipos_update();*/
                                
                            }default ->{
                                System.out.println("\nVolviendo...\n");
                                menu_secundario=false;
                            }
                        }
                    }
                    menu_secundario=true;
                }case 4->{
                    while(menu_secundario){
                        System.out.println("\n------------- Menú Borrar/Eliminar -------------\n¿Dónde va a realizar la acción?");
                        System.out.println("1. Hospital\n2. Departamento\n3. Pabellón\n4. Personal\n5. Paciente\n6. Equipo");
                        a = sc.nextInt();
                        switch(a){
                            case 1->{
                                /*Hospital hospital = new Hospital();
                                hospital.hospital_delete();*/

                            }case 2->{
                                /*Departamento departamento = new Departamento();
                                departamento.departamento_delete();*/
                                
                            }case 3->{
                                /*Pabellon pabellon = new Pabellon();
                                pabellon.pabellon_delete();*/
                                
                            }case 4->{
                                /*Personal personal = new Personal();
                                personal.personal_delete();*/
                                
                            }case 5->{
                                /*Paciente paciente = new Paciente();
                                paciente.paciente_delete();*/
                                
                            }case 6->{
                                /*Equipos equipos = new Equipos();
                                equipos.equipos_delete();*/
                                
                            }default ->{
                                System.out.println("\nVolviendo...\n");
                                menu_secundario=false;
                            }
                        }
                    }
                    menu_secundario=true;
                }
                default->{
                    System.out.println("\n---------- Cerrando la sesión ----------");
                    menu=false;
                }
            }
            a = 0;
        }
    }
}