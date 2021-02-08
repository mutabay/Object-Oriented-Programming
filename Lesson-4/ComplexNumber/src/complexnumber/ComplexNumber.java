
package complexnumber;


public class ComplexNumber {


    public static void main(String[] args) {
        
        DefineComplexNumber complex1 = new DefineComplexNumber( 5 , 6);
        System.out.println("Complex number is " + complex1.GetComplexNumber() );
        
        DefineComplexNumber complex2 = new DefineComplexNumber( 8 , 20);
        System.out.println("Complex number is " + complex2.GetComplexNumber() );
        
        DefineComplexNumber ComplexResult = complex1.addComplexNumber(complex2);
        System.out.println("Complex result is " + ComplexResult.GetComplexNumber() );
        
    }
    
}
