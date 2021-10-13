import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=Integer.parseInt(input.nextLine());
        while(t-->0)
        {
            Triangle p1=new Triangle(input.nextDouble(),input.nextDouble());
            Triangle p2=new Triangle(input.nextDouble(),input.nextDouble());
            Triangle p3=new Triangle(input.nextDouble(),input.nextDouble());
            if(!Triangle.isTriangle(p1,p2,p3))
            {
                System.out.println("INVALID");
            }
            else
            {
                System.out.println(String.format("%.3f", Triangle.AreaOfTheOutSideCircle(p1, p2, p3)));
            }
        }
    }
}
