
package example2;


public class Triangle extends Shape{

    public Triangle() {
    }

    public Triangle(Point start, Point end) {
        super(start, end);
    }
    

    @Override
    public void draw() {
        System.out.println("This is the triangle draw func");
    }

    @Override
    public String toString() {
        return "Triangle ->" + super.toString(); 
    }

    
    
    
    
}
