
public class Point{
    private double x,y;
    Point(double x, double y )
    {
        this.x=x;
        this.y=y;
    }
    Point(){}
    public double getX()
    {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getY()
    {
        return y;
    }
    public String distanceFrom(Point point)
    {
        return String.format("%.4f", Math.sqrt((x-point.x)*(x-point.x)+(y-point.y)*(y-point.y)));
    }
    public static double distanceFromTwo(Point point1,Point point2)
    {
        return Math.sqrt((point1.x-point2.x)*(point1.x-point2.x)+(point1.y-point2.y)*(point1.y-point2.y));
    }
    @Override
    public String toString() {
        return super.toString();
    }
}