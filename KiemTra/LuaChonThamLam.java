import java.util.Scanner;

public class LuaChonThamLam {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        int s=input.nextInt();
        int[] a = new int[n];
        int sum=s;
        for(int i=0;i<n;i++) a[i] =0;
        if(s>n*9||n==1||s<=1)
        {
            System.out.println("-1 -1");
            return;
        }
        int j=0;
        while(s>9)
        {
            a[j] = 9;
            s-=9;
            j++;
        }
        a[j]=s;
        int[] b = new int[n];
        int dem = 1;
        for(int i=0;i<n;i++)
        {
            b[i] =0 ;
        }
        while(dem<10)
        {
            b[0] = dem;
            if((sum-dem)<=(n-1)*9) break;
            else dem++;
        }
        if(dem==10)
        {
            System.out.println("-1 -1");
            return;
        }
        int z=n-1;
        sum=sum-dem;
        while(sum>=9)
        {
            b[z]=9;
            sum=sum-9;
            z--;
        }
        if(z!=0) b[z]=sum;
        for(int i=0;i<n;i++) System.out.print(b[i]);
        System.out.print(" ");
        for(int i=0;i<n;i++) System.out.print(a[i]);
        
    }
}
