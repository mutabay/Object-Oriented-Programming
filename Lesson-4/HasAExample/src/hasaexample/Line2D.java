
package hasaexample;

public class Line2D {

    private PointTwo start;
    private PointTwo end;
    
    
    
    public Line2D(PointTwo start, PointTwo end) {
        this.start = start;
        this.end = end;
    }
    
    public PointTwo getStart() {
        return start;
    }

    public void setStart(PointTwo start) {
        this.start = start;
    }

    public PointTwo getEnd() {
        return end;
    }

    public void setEnd(PointTwo end) {
        this.end = end;
    }
    
    
    public String getLineCoordinates (){
        
        return ( "" + start.getPoint2D() + " <-> " + end.getPoint2D() );
    }

 
    
}
