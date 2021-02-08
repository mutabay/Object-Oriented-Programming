
package example2;

public class Circle extends Shape {

    public Circle() {
    }

    public Circle(Point start, Point end) {
        super(start, end);
    }
    
    
    @Override
    public void draw() {
        System.out.println("This is the draw of circle"); 
    }

    @Override
    public String toString() {
        return "Circle -> " + super.toString(); 
    }

    
    
    
    
    
}
