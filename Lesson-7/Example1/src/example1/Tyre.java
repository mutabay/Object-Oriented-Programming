package example1;

public class Tyre {

    private String brand;
    private int inch;
    
    public Tyre()
    {
        brand = "UNKNOWN";
        inch = 0;
    }
    
    public Tyre(String brand, int inch)
    {
        this.brand = brand;
        this.inch = inch;
    }
    
    public void setbrand(String brand)
    {
        this.brand = brand;
    }
    
    public void setInch(int inch)
    {
        this.inch = inch;
    }
    
    public String getbrand()
    {
        return brand;
    }
    
    public int getInch()
    {
        return inch;
    }
    
    @Override
    public String toString()
    {
        return "Tyre = (" + "brand =" + brand + ",Inch =" + inch +")";
    }
    
    
    
    
}
