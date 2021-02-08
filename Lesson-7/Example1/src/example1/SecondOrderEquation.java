package example1;


public class SecondOrderEquation {
    
    private int a , b ,c;
    
    public SecondOrderEquation()
    {
        a= 1;
        b= 2;
        c= 1;
    }
    
    public SecondOrderEquation(int a , int b ,int c)    
    {
        if ( 0 != a)
        {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        else
            System.out.println("if a will be 0 then this equation can not to be 2ndOrderEquatiın");
        
    }
    
    public void setA(int a)
    {
        this.a = a;
    }
    
    public void setB(int b)
    {
        this.b = b;
    }
            
    public void setC(int c)
    {
        this.c = c;
    }
    
    public String calculateRoots()
    {
        double root1;
        double root2;
        String str = "";
        
        double delta = b*b - (4 * a * c);
        
        if (delta >= 0)
        {
            root1 = (-b + Math.sqrt(delta)) / 2*a;
            root2 = (-b - Math.sqrt(delta)) / 2*a;
            
            str += "There are 2 different root -> 1.ROOT is : " + root1 + " 2.ROOT is : " + root2; 
        }
        
        if (delta < 0)
            str+="There are no real root" ;
         
        return str;
        
        
    }
    
    @Override
    public String toString()
    {
        return "Eqution is -------> =" + a + "x^2" + " + " + b + "x" + c ;  
    }
            
            
            
            
    
}
