
package example1;


public class Car {
    
    private Tyre tyre;
    private Engine engine;
    
    public Car()
    {
        tyre = new Tyre();
        engine = new Engine();
    }
    
    public Car(Tyre tyre , Engine engine)
    {
        this.tyre = tyre;
        this.engine = engine;
    }
    
    public void setTyre(Tyre tyre)
    {
        this.tyre = tyre;
    }
    
    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }
    
    public Tyre getTyre()
    {
        return tyre;
    }
    
    public Engine getEngine()
    {
        return engine;
    }
    
    @Override
    public String toString()
    {
        return "Car has \n\t" + engine.toString() + tyre.toString();
    }
            
    
    
    
    
}
