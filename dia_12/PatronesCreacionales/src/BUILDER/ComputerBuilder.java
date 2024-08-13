package BUILDER;

public abstract class ComputerBuilder {
    protected Computer computer;
    
    public Computer getComputer(){
        return computer;
    }
    
    public void createNewComputer(){
        computer = new Computer();
    }
    
    public abstract void buildCPU();
    public abstract void buildGPU();
    public abstract void buildRAM();
    public abstract void buildStorage();

}
