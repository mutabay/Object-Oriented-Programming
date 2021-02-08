
package singleton.designpattern1;

public class SingletonDesignPattern1 {

    public static void main(String[] args) {

        SingletonPoint.getInstance().setY(8);
        int a = SingletonPoint.getInstance().getY();
        
        System.out.println(a);
        
    }
    
}
