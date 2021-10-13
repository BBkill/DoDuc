public class Triangle {
    private double x,y;
    Triangle(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    Triangle(){}
    public static double DistenceFrom(Triangle t1,Triangle t2)
    {
        return Math.sqrt((t1.x-t2.x)*(t1.x-t2.x)+(t1.y-t2.y)*(t1.y-t2.y));
    }
    public double Distence(Triangle t)
    {
        return Math.sqrt((x-t.x)*(x-t.x)+(y-t.y)*(y-t.y));
    }
    public static boolean isTriangle(Triangle t1,Triangle t2,Triangle t3)
    {
        if((DistenceFrom(t1,t2)+DistenceFrom(t1, t3)>DistenceFrom(t3, t2)) && (DistenceFrom(t1,t2)+DistenceFrom(t2, t3)>DistenceFrom(t3, t1)) && (DistenceFrom(t3,t2)+DistenceFrom(t1, t3)>DistenceFrom(t1, t2))) return true;
        return false;
    }
    public static double Perimeter(Triangle t1,Triangle t2,Triangle t3)
    {
        
        return DistenceFrom(t1, t2)+DistenceFrom(t3, t2)+DistenceFrom(t1, t3);
    }
    public static double Area(Triangle t1,Triangle t2,Triangle t3)
    {
        double firstEdge = DistenceFrom(t1, t2);
        double secondEdge = DistenceFrom(t1, t3);
        double thirdEdge = DistenceFrom(t3, t2);
        double semiPermiter = (firstEdge+secondEdge+thirdEdge)/2;
        return Math.sqrt(semiPermiter*(semiPermiter-firstEdge)*(semiPermiter-secondEdge)*(semiPermiter-thirdEdge));

    }
    public static double AreaOfTheOutSideCircle(Triangle t1,Triangle t2,Triangle t3)
    {
        double firstEdge = DistenceFrom(t1, t2);
        double secondEdge = DistenceFrom(t1, t3);
        double thirdEdge = DistenceFrom(t3, t2);
        double Radius = firstEdge*secondEdge*thirdEdge/4/Area(t1, t2, t3);
        return Math.PI*Math.pow(Radius, 2);
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}