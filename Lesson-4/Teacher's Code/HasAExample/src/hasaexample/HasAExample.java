package hasaexample;

public class HasAExample {
    public static void main(String[] args) {
        Point2D pt1 = new Point2D();
        System.out.println("POINT(1) is " + pt1.getPoint2D());
        
        Point2D pt2 = new Point2D(7, 9);
        System.out.println("POINT(2) is " + pt2.getPoint2D());
        
        Line2D line = new Line2D(pt1, pt2);
        System.out.println("LINE COORDINATES are " + line.getLineCoordinates());
    }
    
}
