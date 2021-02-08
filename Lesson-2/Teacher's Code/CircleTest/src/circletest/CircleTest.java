package circletest;

public class CircleTest {
    public static void main(String[] args) {
        Circle ref_circle; // A Reference for Circle class
       
        // Create a Circle OBJECT using DEFAULT constructor
//        ref_circle = new Circle();
//        System.out.println("Circle's radius is " + ref_circle.getRadius());
//        
        
        ref_circle = new Circle(10);
        System.out.println("Circle's radius is " + ref_circle.getRadius());
        System.out.println("Circumference : " + ref_circle.calculateCircumference());
        System.out.println("Area : " + ref_circle.calculateArea());
        
        System.out.println("Circumference (pi=3) : " + ref_circle.calculateCircumference(3.0));
        System.out.println("Area (pi=3) : " + ref_circle.calculateArea(3.0));
        
        //Circle ref_circle2; // A Reference for Circle class
        // Create a Circle OBJECT using DEFAULT constructor
//        ref_circle2 = new Circle(7);
//        System.out.println("Circle's radius is " + ref_circle2.getRadius());
        
        
        
        System.exit(0);
    }
}
