package hasaexample;



public class HasAExample {

    
    public static void main(String[] args) {
        
        PointTwo pt1 = new PointTwo( 0, 0);
        
        System.out.println("POINT(1) is " + pt1.getPoint2D());
        
        
        PointTwo pt2 = new PointTwo(7 , 9);
        System.out.println("POINT(2) is " + pt2.getPoint2D());
            
        Line2D line = new Line2D(pt1, pt2);
        System.out.println("LINE COORDINATES are  " +line.getLineCoordinates());
        


    }
    
}
