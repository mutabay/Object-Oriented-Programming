package has_a_relation_computer;

public class CPU {
    private String brand;
    private String model;
    private float speed;    
    private int generation;

    public CPU() {
        brand = "UNKNOWN";
        model = "UNKNOWN";
        speed = 0.0f;
        generation = 0;
    }

    public CPU(String brand, String model, float speed, int generation) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.generation = generation;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }
    
    public void printCpuInfo() {
        System.out.println("***** CPU INFO *****");
        System.out.println("CPU Brand : " + brand);
        System.out.println("CPU Model : " + model);
        System.out.println("CPU Speed : " + speed + "GHz");
        System.out.println("CPU Generation : " + generation);
    }
    
    
}
