package BUILDER;

public class GamingComputerBuilder extends ComputerBuilder{

    @Override
    public void buildCPU() {
        computer.setCPU("Intel i9");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("RTX 40 90");
    }

    @Override
    public void buildRAM() {
        computer.setRAM(64);
    }

    @Override
    public void buildStorage() {
        computer.setStorage(1000);
    }
}
