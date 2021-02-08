package circletest;

public class CircleTest {


    public static void main(String[] args) {
        
        Circle ref_circle; // Reference for Circle class
        
        ref_circle = new Circle();
        System.out.println("Circle's radius is " + ref_circle.getRadius());
        
        ref_circle = new Circle (15);   //Aynı referans ismi olursa değiştirip üstüne yazar....
        System.out.println("Circle's radius is " + ref_circle.getRadius());
     
//        Circle ref_parCircle = new Circle (15);
//        System.out.println("Circle's radius is " + ref_parCircle.getRadius());
//        
        ref_circle = new Circle(10);
        System.out.println("Circle's radius is : " + ref_circle.getRadius());
        System.out.println("Circle's Circumference is : " + ref_circle.CalculateFerenceConst());
        System.out.println("Circle's area is " + ref_circle.CalculateAreaConst());
        

        System.out.println("Circle's Circumference is (pi = 3): " + ref_circle.CalculateFerenceConst(3));
        System.out.println("Circle's area is (pi = 3)" + ref_circle.CalculateAreaConst(3));



    }
    
}
