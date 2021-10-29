import java.util.Scanner;

public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0)
        {
            long n = input.nextLong();
            System.out.println(check(n));
            
        }
    }
    static String check(long n)
    {
        long a = (long)Math.sqrt((double)n);
        if(a*a==n) return "YES";
        return "NO";
    }
}
