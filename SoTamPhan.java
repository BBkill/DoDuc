import java.util.Scanner;
public class SoTamPhan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t=in.nextInt();
        while(t-->0)
        {
            long n=in.nextLong();
            if(Check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }    
    static boolean Check(long n)
    {
        while(n>0)
        {
            long tmp=n%10;
            if(tmp==0||tmp==1||tmp==2)
            {
                n=n/10;
            }
            else return false;
        }
        return true;
    }
}
