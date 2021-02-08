package circletest;

public class Circle {
    private int radius;
    
    // DEFAULT Contructor
    public Circle() {
        System.out.println("DEFAULT constructor of Circle");
        radius = 0;
    }
    
    // PARAMETRIC Contructor
    public Circle(int r) {
        System.out.println("PARAMETRIC constructor of Circle");
        radius = r;
    }
    
    /* ACCESSOR METHODS  */
    public void setRadius(int r) {
        radius = r;
    }
    
    public int getRadius() {
        return radius;
    }
    
    public double calculateCircumference() {
        return (2 * Math.PI * radius);
    }
    
    public double calculateCircumference(double pi) {
        return (2 * pi * radius);
    }
    
    public double calculateArea() {
        return (Math.PI * radius * radius);
    }
    
    public double calculateArea(double pi) {
        return (pi * radius * radius);
    }    
}
