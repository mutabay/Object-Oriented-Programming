package has_a_relation_computer;

public class SecondaryStorage {
    private String brand;
    private String type;
    private int capacity;

    public SecondaryStorage() {
        brand = "UNKNOWN";
        type = "UNKNOWN";
        capacity = 0;
    }

    public SecondaryStorage(String brand, String type, int capacity) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public void printStorageInfo() {
        System.out.println("***** STORAGE INFO *****");
        System.out.println("CPU Brand : " + brand);
        System.out.println("CPU Type : " + type);
        System.out.println("CPU Capacity : " + capacity + "GB");
    }
}
