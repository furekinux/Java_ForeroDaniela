package baloncesto;

import java.util.Scanner;
/**
 *
 * @author camper
 */
public class Baloncesto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String reset = "\033[0m";
        final String blue = "\033[34m";
        final String green = "\033[32m";
        final String red = "\033[31m";
        
        int choice;
        boolean main = true;
        boolean sec = true;
        
        Partido partido1 = new Partido("Boston Celtics","New Jersey Nets",10,9,"Finalizado","2013-08-12");
        PlayOffs partidoplayoff = new PlayOffs("New York Knicks","Philadelphia 76ers",13,7,"Finalizado","2006-12-08","Octavos");
        Liga partidoliga = new Liga("Toronto Raptors","Chicago Bulls",10,10,"Activo","2023-10-10",1);
        
        while(main){
            System.out.println(blue+"\n@. *|+ Menu Principal Baloncesto +|* .@"+reset);
            System.out.println("Bienvenid@ a la Liga de baloncesto, ¿Qué desea realizar?");
            System.out.println("1. Visualización de información\n2. Modificación de información\n3. Finalizar partido\n0. Salir");
            choice = sc.nextInt();
            switch(choice){
                case 1->{
                    while(sec){
                        System.out.println(blue+"\n@. *|+  Visualizar información  +|* .@"+reset);
                        System.out.println("¿Qué partido disponible desea visualizar?\n1. Partido de Liga\n2. Partido PlayOff\n3. Partido Corriente.\n4. Volver");
                        choice = sc.nextInt();
                        switch(choice){
                            case 1->{
                                partidoliga.verInformacion();
                            }case 2->
                                partidoplayoff.verInformacion();
                            case 3->
                                partido1.verInformacion();
                            default->{
                                System.out.println("\n"+red+"Volviendo al Menú principal...\n\n"+reset);
                                sec=false;
                            }
                        }
                    }
                    sec=true;
                }case 2->{
                    while(sec){
                        System.out.println(blue+"\n@. *|+  Modificar información  +|* .@"+reset);
                        System.out.println("¿Qué partido disponible desea modificar?\n1. Partido de Liga\n2. Partido PlayOff\n3. Partido Corriente.\n4. Volver");
                        choice = sc.nextInt();
                        switch(choice){
                            case 1->{
                                partidoliga.modificarInformacion();
                            }case 2->{
                                partidoplayoff.modificarInformacion();
                            }case 3->{
                                 partido1.modificarInformacion();
                            }default->{
                                System.out.println("\n"+red+"Volviendo al Menú principal...\n\n"+reset);
                                sec=false;
                            }
                        }
                    }
                    sec=true;
                }case 3->{
                    while(sec){
                        System.out.println(blue+"\n@. *|+  Finalizar Partido  +|* .@"+reset);
                        System.out.println("¿Qué partido disponible desea finalizar?\n1. Partido de Liga\n2. Partido PlayOff\n3. Partido Corriente.\n4. Volver");
                        choice = sc.nextInt();
                        switch(choice){
                            case 1->{
                                partidoliga.finalizarPartido();
                            }case 2->{
                                partidoplayoff.finalizarPartido();
                            }case 3->{
                                 partido1.finalizarPartido();
                            }default->{
                                System.out.println("\n"+red+"Volviendo al Menú principal...\n\n"+reset);
                                sec=false;
                            }
                        }
                    }
                    sec=true;
                }default ->{
                    System.out.println("\n"+red+"Cerrando sesión...");
                    main=false;
                }
            }
        }
    }
}
