
package example2;

public class Example2 {

    public static void main(String[] args) {

        Point start = new Point(0, 5);
        Point end = new Point(5 , 0);
        
        Shape shape = new Shape(start, end);
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        
        System.out.println(shape.toString());
        shape.draw();
        System.out.println(circle.toString());
        circle.draw();
        System.out.println(rectangle.toString());
        rectangle.draw();
        System.out.println(triangle.toString());
        //triangle.draw();

    }
    
}
