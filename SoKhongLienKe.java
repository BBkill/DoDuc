import java.util.Scanner;



public class SoKhongLienKe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            long n=in.nextLong();
            if(modulo10(n)&&distence(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean modulo10(long n)
    {
        if(n<18) return false;
        long tmp=0;
        while(n>0)
        {
            tmp=tmp+n%10;
            n=n/10;
        }
        if(tmp%10==0) return true;
        return false;
    } 
    static boolean distence(long n)
    {
   
        if(n<11) return false;
        long tmp=n%10;
        n=n/10;
        while(n>0)
        {
            if(tmp-n%10==2||tmp-n%10==-2) 
            {
                tmp=n%10;
                n=n/10;
            }
            else return false;
        }
        return true;
    }
}
