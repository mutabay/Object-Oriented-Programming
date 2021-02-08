package has_a_relation_computer;

public class Computer {
    
    // "HAS A" relation member variables/objects/references
    private CPU cpu;
    private RAM ram;
    private SecondaryStorage storage;

    public Computer() {
        cpu = new CPU();
        ram = new RAM();
        storage = new SecondaryStorage();
    }

    public Computer(CPU cpu, RAM ram, SecondaryStorage storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public SecondaryStorage getStorage() {
        return storage;
    }

    public void setStorage(SecondaryStorage storage) {
        this.storage = storage;
    }
    
    public void printComputerInfo() {
        cpu.printCpuInfo();
        ram.printRamInfo();
        storage.printStorageInfo();
    }
    
}
