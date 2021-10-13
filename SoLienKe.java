import java.util.Scanner;

public class SoLienKe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            long n=in.nextLong();
            if(distence(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean distence(long n)
    {
   
        if(n<11) return false;
        long tmp=n%10;
        n=n/10;
        while(n>0)
        {
            if(tmp-n%10==1||tmp-n%10==-1) 
            {
                tmp=n%10;
                n=n/10;
            }
            else return false;
        }
        return true;
    }
}
