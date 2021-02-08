package encapsulation;

class Test {
    private int month ;
    
    
    public Test() {
        System.out.println("This is DEFAULT CONSTRUCTOR of Test");
        month = 1;
    }
    
    //kontrolü burda yap
    public void setMonth(int m){
        if (m > 0 && m < 13)
        {   
            month = m;
        }
    }
    
    //burda veriyi yolla
    public int getMonth(int m){
        return month;
                
    }
    
}



public class Encapsulation {

    public static void main(String[] args) {
        
        Test ref = new Test();
        //ref.number = 3;
        
        System.out.println(ref.toString());
        System.exit(0);
        
        
        



    }
    
}
