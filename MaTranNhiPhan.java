import java.util.Scanner;

public class MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int[][] a=new int[n][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        int dem=0;
        for(int i=0;i<n;i++)
        {
            int tmp1=0,tmp0=0;
            for(int j=0;j<3;j++)
            {
                if(a[i][j]==0) tmp0++;
                else tmp1++;
            }
            if(tmp1>tmp0) dem++;
        }
        System.out.println(dem);
    }
}
