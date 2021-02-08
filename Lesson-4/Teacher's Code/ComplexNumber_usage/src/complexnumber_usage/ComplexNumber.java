package complexnumber_usage;

public class ComplexNumber {
    private int real, imaginary;

    public ComplexNumber() {
        real = 0;
        imaginary = 0;
    }

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }
    
    public String getComplexNumber() {
        return ("(" + real + " + " + imaginary + "i)");
    }
    
    public ComplexNumber addComplexNumber(ComplexNumber number) {
        int real_part = getReal() + number.getReal();
        int imaginary_part = getImaginary() + number.getImaginary();
        return (new ComplexNumber(real_part, imaginary_part));
    }
    
}
