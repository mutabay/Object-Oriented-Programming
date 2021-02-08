
package complexnumber.pkg2dpoint.pkg2dline.practice;



public class ComplexNumber2DPoint2DLinePractice {

    public static void main(String[] args) {

        
        /* COMPLEX NUMBERS
        
        ComplexNumber complex1 ;
        complex1 = new ComplexNumber();
        
        ComplexNumber complex2= new ComplexNumber( 5 , 6);
        
        System.out.println(" Complex number is : " + complex1.GetComplexNumber());
        
        System.out.println(" Complex number is : " + complex2.GetComplexNumber());
        
        ComplexNumber resultOfAddition = complex1.AddComplexNumber(complex2);
        System.out.println(" Result of Addition to Complex Numbers is  : " + resultOfAddition.GetComplexNumber());

        */
        
        
        
        
        Point2D pt1 ;
        pt1 = new Point2D();
        
        Point2D pt2 = new Point2D( 5 , 6);
        
        
        System.out.println(" First Point is on " + pt1.GetPoint2D() + "In coordinate system" );
        System.out.println(" First Point is on " + pt2.GetPoint2D() + "In coordinate system" );
        
        
        Line2DP line = new Line2DP(pt1, pt2);
        
        System.out.println(" line is on " + line.getLine2D());
        
        
        
        
    }
    
}
