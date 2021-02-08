


package hasaexample;


public class PointTwo {

    private int x, y;
    
    //DEFAULT CONST.
    public PointTwo (){ 
        
        x = 0;
        y = 0;
        
    }
    
    //PARAMETRIC CONST.
    public PointTwo( int x, int y){
        
        this.x = x;
        this.y = y;
    }
    
    public void setX( int x)
    {
        this.x = x;
    }
    
    public void setY ( int y)
    {
        this.y = y;
    }
    
    public int getX ()
    {
        return x;
    }
    
    public int gexY ()
    {
        return y;
    }
    
    public String getPoint2D ()
    {
        
        return ("(" + x + "," + y + ")"  );
    }
    
    
    

    
}
