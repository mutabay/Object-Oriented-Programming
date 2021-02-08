
package arrays;
public class Arrays {

    public static void main(String[] args) {
        
       int[] int_arr;//Reference oluşturma.
       
       int_arr = new int[5];
       
        for (int i = 0; i < int_arr.length; i++) {
            
            int_arr[i] = i + 1;
        }
        
        for (int i = 0; i < int_arr.length; i++) {
            
            System.out.println("int_arr[" + i + "] = " + int_arr[i]);
        }










        
    }
    
}
