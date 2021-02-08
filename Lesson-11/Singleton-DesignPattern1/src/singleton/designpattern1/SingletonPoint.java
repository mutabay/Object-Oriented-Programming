package singleton.designpattern1;

public class SingletonPoint {
    
    private int x;
    private int y;
    private static SingletonPoint instance = null;
    
    public static SingletonPoint getInstance()
    {
        if( null == instance)
            instance = new SingletonPoint();
        return instance;
    }

    private SingletonPoint() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
            
}
