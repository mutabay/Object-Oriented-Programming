package has_a_relation_computer;

public class Has_A_Relation_Computer {
    public static void main(String[] args) {
        Computer silly_computer = new Computer();
        silly_computer.printComputerInfo();
        
        CPU cpu = new CPU("AMD", "Ryzen 9", 3.6f, 3);
        RAM ram = new RAM("Kingston", "DDR4", 3.2f, 16);
        SecondaryStorage storage = new SecondaryStorage("Samsung", "NVME", 512);
        Computer computer = new Computer(cpu, ram, storage);
        computer.printComputerInfo();
    }
}
