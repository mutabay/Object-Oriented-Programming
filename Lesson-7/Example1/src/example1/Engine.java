
package example1;

public class Engine {
    
    public static final int FUEL_TYPE_UNKNOWN = 0;
    public static final int FUEL_TYPE_GAS = 1;
    public static final int FUEL_TYPE_DIESEL = 2;
    public static final int FUEL_TYPE_HYBRID =3;
    
    private int cc;
    private int fuel_type;
    
    public Engine()
    {
        cc = 0;
        fuel_type = 0;
    }
    
    public Engine( int cc , int fuel_type)
    {
        this.cc = cc;
        this.fuel_type = fuel_type;
    }
    
    public void setCC(int cc)
    {
        this.cc = cc;
    }
    
    public void setFuel_Type(int fuel_type)
    {
        this.fuel_type = fuel_type; 
    }
    
    public int getCC()
    {
        return cc;
    }
    
    public int getFuel_Type()
    {
        return fuel_type;
    }
    
    private String mapFuelType2String()
    {
        switch(fuel_type)
        {
            case FUEL_TYPE_GAS :
                return "Gas";
            case FUEL_TYPE_DIESEL :
                return "Diesel";
            case FUEL_TYPE_HYBRID : 
                return "Hybrid";
            default:
                return "UNKNOWN";
            
        }
    }
    
    @Override
    public String toString()
    {
        return "Engine (" + "cc =" + cc + ",fuel_type =" + mapFuelType2String() +")";
    }
}
