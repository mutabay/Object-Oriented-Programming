
package example2;

public class Rectangle extends Shape{

    public Rectangle() {
    }

    public Rectangle(Point start, Point end) {
        super(start, end);
    }
    
    

    @Override
    public void draw() {
        System.out.println("This is the rectangle draw");
    }

    @Override
    public String toString() {
        return "Rectangle" + super.toString(); 
    }
    
    
    
    
    
    
}
