/*import java.util.Scanner;

public class KiemTraFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp=sc.nextInt();
        long[] fi=new long[100];
        fi[0]=(long) 0;
        fi[1]=(long) 1;
        fi[2]=(long) 1;
        for(int i=3;i<=93;i++)
        {
            fi[i]=fi[i-1]+fi[i-2];
        }
        while(tmp>0)
        {
            long n=sc.nextLong();
            // int first=(int)1,last=(int)93;
            // int mid=(first+last)/2;
             boolean check=false;
            // while(first<=last)
            // {
            //     if(n==fi[mid])
            //     {
            //         System.out.println("YES");
            //         check=true;
            //         break;
            //     }
            //     else if(n<fi[mid])
            //     {
            //         last=mid-1;
            //         mid=(first+last)/2;
            //     }
            //     else if(n>fi[mid])
            //     {
            //         first=mid+1;
            //         mid=(first+last)/2;
            //     }
            // }
            for(int i=0;i<94;i++) if(n==fi[i])
            {
                System.out.println("YES");
                check=true;
                break;
            }
            if(check==false) System.out.println("NO");
            tmp=tmp-1;
        }
    }
    
}*/
