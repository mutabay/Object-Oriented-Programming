package complexnumber.pkg2dpoint.pkg2dline.practice;




public class ComplexNumber {

    private int real, imaginary;
    
    public ComplexNumber(){
        
        real = 0;
        imaginary = 0;
    }
    
    public ComplexNumber ( int real, int imaginary){
        
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public void setReal( int real){
        this.real = real;
    }
    
    public void setImaginary( int imaginary){
        this.imaginary = imaginary;
    }
    
    public int getReal(){
        
        return real;
    }
    
    public int getImaginary(){
        
        return imaginary;
    }
    
    public String GetComplexNumber (){
        
        return ("" + real + " + " + imaginary + "i");
    }
    
    public ComplexNumber AddComplexNumber ( ComplexNumber number){
        
        int real_part = getReal() + number.getReal();
        int imaginary_part = getImaginary() + number.getImaginary();
        
        return ( new ComplexNumber( real_part , imaginary_part));
    }
    
}
