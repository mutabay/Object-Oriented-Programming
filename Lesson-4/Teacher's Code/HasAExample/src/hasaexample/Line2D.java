package hasaexample;

public class Line2D {
    private Point2D start;
    private Point2D end;

    public Line2D() {
    }

    public Line2D(Point2D start, Point2D end) {
        this.start = start;
        this.end = end;
    }

    public Point2D getStart() {
        return start;
    }

    public void setStart(Point2D start) {
        this.start = start;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }
    
    public String getLineCoordinates() {
        return ("" + start.getPoint2D() + "<->" + end.getPoint2D());
    }
}
