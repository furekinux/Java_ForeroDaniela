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
        
        Partido partido1 = new Partido("Toronto Raptors","Chicago Bulls",10,9,"Finalizado","2013-08-12");
        
        PlayOffs partidoplayoff = new PlayOffs("Toronto Raptors","Chicago Bulls",10,9,"Finalizado","2023-10-10","Octavos");

        Liga partidoliga = new Liga("Toronto Raptors","Chicago Bulls",10,9,"Finalizado","2023-10-10",1);

        System.out.println(partidoliga.getEquipoLocal());
        
        while(main){
            System.out.println(blue+"\n@. *|+ Menu Principal Baloncesto +|* .@"+reset);
            System.out.println("Bienvenid@ a la Liga de baloncesto, ¿Qué desea realizar?");
            System.out.println("1. Visualización de información\n2. Modificación de información\n3. Finalizar partido.");
            choice = sc.nextInt();
            switch(choice){
                case 1->{
                    while(sec){
                        System.out.println(blue+"\n@. *|+  Visualizar información  +|* .@"+reset);
                        System.out.println("¿Qué partido disponible desea visualizar?\n1. Partido de Liga\n2. Partido PlayOff\n3. Partido Corriente.\n4. Volver");
                        choice = sc.nextInt();
                        switch(choice){
                            case 1->{
                                System.out.println(blue+"\n@. *|+  Partido de Liga  +|* .@"+reset);
                                System.out.println("¿Qué tipo de información quiere visualizar?");
                                System.out.println("1. Información general de partido\n2. Marcador actual de partido\n3. Resultados de partido\n4. Equipo Ganador\n0. Volver");
                                choice = sc.nextInt();
                                switch(choice){
                                    case 1->{
                                        partidoliga.partidoInfo();
                                    }case 2->{
                                        partidoliga.partidoMarcador();
                                    }case 3->{
                                        partidoliga.partidoResultados();
                                    }case 4->{
                                        partidoliga.equipoGanador();
                                    }default->{
                                        System.out.println("\n"+red+"Volviendo al Menú principal...\n\n"+reset);
                                        sec=false;
                                    }
                                }
                            }case 2->{
                                System.out.println(blue+"\n@. *|+  Partido PlayOff  +|* .@"+reset);
                                System.out.println("¿Qué tipo de información quiere visualizar?");
                                System.out.println("1. Información general de partido\n2. Marcador actual de partido\n3. Resultados de partido\n4. Equipo Ganador\n0. Volver");
                                choice = sc.nextInt();
                                switch(choice){
                                    case 1->{
                                        partidoplayoff.partidoInfo();
                                    }case 2->{
                                        partidoplayoff.partidoMarcador();
                                    }case 3->{
                                        partidoplayoff.partidoResultados();
                                    }case 4->{
                                        partidoplayoff.equipoGanador();
                                    }default->{
                                        System.out.println("\n"+red+"Volviendo al Menú principal...\n\n"+reset);
                                        sec=false;
                                    }
                                }
                            }case 3->{
                                System.out.println(blue+"\n@. *|+  Partido de Corriente  +|* .@"+reset);
                                System.out.println("¿Qué tipo de información quiere visualizar?");
                                System.out.println("1. Información general de partido\n2. Marcador actual de partido\n3. Resultados de partido\n4. Equipo Ganador\n0. Volver");
                                choice = sc.nextInt();
                                switch(choice){
                                    case 1->{
                                        partido1.partidoInfo();
                                    }case 2->{
                                        partido1.partidoMarcador();
                                    }case 3->{
                                        partido1.partidoResultados();
                                    }case 4->{
                                        partido1.equipoGanador();
                                    }default->{
                                        System.out.println("\n"+red+"Volviendo al Menú principal...\n\n"+reset);
                                        sec=false;
                                    }
                                }
                            }default->{
                                System.out.println("\n"+red+"Volviendo al Menú principal...\n\n"+reset);
                                sec=false;
                            }
                        }
                    }
                    sec=true;
                }case 2->{
                    while(sec){
                        System.out.println(blue+"\n@. *|+  Visualizar información  +|* .@"+reset);
                        System.out.println("¿Qué tipo de información quiere modificar?");
                        System.out.println("1. Equipo Local\n2. Equipo Visitante\n3. Resultados de partido\n4. Equipo Ganador\n0. Volver");
                        choice = sc.nextInt();
                        switch(choice){
                            case 1->{
                                
                            }case 2->{
                                
                            }case 3->{
                               
                            }case 4->{
                                
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
