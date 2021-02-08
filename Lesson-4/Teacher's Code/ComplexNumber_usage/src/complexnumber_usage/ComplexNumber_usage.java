package complexnumber_usage;

public class ComplexNumber_usage {

    public static void main(String[] args) {
        ComplexNumber complex = new ComplexNumber(3, 5);
        System.out.println("Complex number(1) is " + complex.getComplexNumber());
        
        
        ComplexNumber complex2 = new ComplexNumber(7, 9);
        System.out.println("Complex number(2) is " + complex2.getComplexNumber());
        
        ComplexNumber complexResult = complex.addComplexNumber(complex2);
        System.out.println("RESULTing Complex number is " + complexResult.getComplexNumber());
        
    }
    
}
