package circletest;

public class Circle {
        
    private int radius;
    
    
    //DEFAULT CONSTRUCTOR!!!
    public Circle() {
        System.out.println("DEFAULT constructor of Circle");
        radius = 0;
    }
    
    // PARAMETRIC CONSTRUCTOR!!!
    public Circle(int r) {
        System.out.println("PARAMETRIC constructor of Circle");
        radius = r;
    }
    
    public double CalculateFerenceConst(){
        return( 2 * Math.PI * radius);
    }
    
    public double CalculateFerenceConst(double PI){
        return( 2 * PI * radius);
    }
    
    public double CalculateAreaConst(){
        return ( Math.PI * radius * radius );
    }
    
    public double CalculateAreaConst(double PI){
        return ( PI * radius * radius );
    }
    
    
    // ACCESSOR METHODS 
    public void setRadius( int r){
        radius = r;
    }
    
    public int getRadius() {
        return radius;
    }
        
    
}
