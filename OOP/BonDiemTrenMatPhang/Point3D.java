public class Point3D {
    private int x,y,z;
    Point3D(int x,int y,int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    Point3D(){}
    private static Point3D toVector(Point3D p1, Point3D p2)
    {
        p1.x=p2.x-p1.x;
        p1.y=p2.y-p1.y;
        p1.z=p2.z-p1.z;
        return p1;
    }
    private static int mulVector(Point3D p1, Point3D p2)
    {
        return p1.x*p2.x+p1.y*p2.y+p1.z*p2.z;
    }
    private static int Surface(Point3D p1, Point3D p2, Point3D p3,Point3D p4)
    {
        p1=toVector(p1, p4);
        p2=toVector(p2, p4);
        p3=toVector(p3, p4);
        Point3D tmp=new Point3D();
        tmp.x=p1.y*p2.z-p2.y*p1.z;
        tmp.y=p1.z*p2.x-p1.x*p2.z;
        tmp.z=p1.x*p2.y-p2.x*p1.y;
        return mulVector(p3, tmp);
    }
    public static boolean check(Point3D p1, Point3D p2, Point3D p3,Point3D p4)
    {
        if(Surface(p1, p2, p3, p4)==0) return true;
        return false;
    }
    
}