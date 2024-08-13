package BUILDER;

public class Computer {
    private String CPU;
    private String GPU;
    private int RAM;
    private int storage;
    
    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" + "CPU=" + CPU + ", GPU=" + GPU + ", RAM=" + RAM + ", storage=" + storage + '}';
    }
    
}
