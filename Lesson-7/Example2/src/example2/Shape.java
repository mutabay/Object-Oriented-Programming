
package example2;


public class Shape {
    
    private Point start;
    private Point end;

    public Shape() {
        
    }

    public Shape(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    
    public void draw()
    {
        System.out.println("This is the draw function shape");
    }

    @Override
    public String toString() {
        return "Shape{" + "start=" + start + ", end=" + end + '}';
    }

    
    
    
    
    
    
    
}
