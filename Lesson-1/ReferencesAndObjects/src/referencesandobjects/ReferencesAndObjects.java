
package referencesandobjects;

public class ReferencesAndObjects {

    public static void main(String[] args) {

        String strRef;
        
        strRef = new String("SE 237");
        //strRef = "SE 237"; stringlerde istisna çift tırnak ile de yer alınır.
        if (null == strRef) {
            System.out.println("String reference is null");
            
        }
        
        else{
            System.out.println("STRING :" + strRef);
        }

    }
    
}
