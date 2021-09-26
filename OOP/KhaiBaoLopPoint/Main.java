import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for(int i=0;i<n;i++)
        {
            Point point1 = new Point(input.nextDouble(),input.nextDouble());
            Point point2 = new Point(input.nextDouble(),input.nextDouble());
            System.out.println(String.format("%.4f", Point.distanceFromTwo(point1,point2)));
        }
    }
}
