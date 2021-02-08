package complexnumber;



public class DefineComplexNumber {

    private int real, imaginary;
    
    public DefineComplexNumber(){ //DEFAULT CONST.
        
        real = 0;
        imaginary = 0;
        
    }
    
    public DefineComplexNumber( int real , int imaginary){
        
        this.imaginary = imaginary;
        this.real = real;
    }
    
    public void setReal( int real){
        
        this.real = real;
    }
    
    public int getReal (){
        
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }
    
    public String GetComplexNumber() {
        
        return( "" + real + " + " +  imaginary + "i" ) ;
        
    }
    
    
    public DefineComplexNumber addComplexNumber ( DefineComplexNumber number)
    {
        
     int real_part = getReal() + number.getReal();
     int imaginary_part = getImaginary() + number.getImaginary();
     
     return (new DefineComplexNumber( real_part, imaginary_part ));

        
    }
    
    
    
}
