package BUILDER;

public class BuilderExample {

    // Definición: es un patrón que separa la construcción de un objeto complejo
    // de su representación, permitiendo que el mismo proceso de construcción
    // pueda crear representaciones diferentes
    
    // Modularizar la construcción
    
    public static void main(String[] args) {
        Director director = new Director();
        ComputerBuilder builder = new GamingComputerBuilder();
        
        director.setComputerBuilder(builder);
        director.constructComputer();
        
        Computer computer = new Computer();
        System.out.println(computer);
    }
    
}
