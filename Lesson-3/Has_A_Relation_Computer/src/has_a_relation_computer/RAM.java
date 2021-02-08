package has_a_relation_computer;

public class RAM {
    private String brand;
    private String type;
    private float speed;
    private int capacity;

    public RAM() {
        brand = "UNKNOWN";
        type = "UNKNOWN";
        speed = 0;
        capacity = 0;
    }

    public RAM(String brand, String type, float speed, int caapcity) {
        this.brand = brand;
        this.type = type;
        this.speed = speed;
        this.capacity = caapcity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public void printRamInfo() {
        System.out.println("***** RAM INFO *****");
        System.out.println("CPU Brand : " + brand);
        System.out.println("CPU Type : " + type);
        System.out.println("CPU Speed : " + speed + "GHz");
        System.out.println("CPU Capacity : " + capacity + "GB");
    }
    
}
