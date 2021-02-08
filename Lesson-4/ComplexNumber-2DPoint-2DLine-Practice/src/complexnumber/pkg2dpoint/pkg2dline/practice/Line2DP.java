package complexnumber.pkg2dpoint.pkg2dline.practice;


public class Line2DP {
    
    private Point2D start , end;
    
    public Line2DP (Point2D start , Point2D end ){
        
        this.start = start;
        this.end = end;
    }
    
    public void setStart( Point2D start){
        this.start = start;
    }
    
    public void setEnd(Point2D end){
        this.end = end;
    }
    
    public Point2D getStart() {
        return start;
    }
    
    public Point2D getEnd(){
        return end;
    }
    
    public String getLine2D ( ){
        
        return  ("(" + start.GetPoint2D() + " <->" + end.GetPoint2D() + ")"  ); 
                
    }
}
