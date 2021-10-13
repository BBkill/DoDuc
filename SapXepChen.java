import java.util.Scanner;
public class SapXepChen{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int k=a[i],j=i-1;
            while(j>=0&&a[j]>k)
            {
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=k;
            
            System.out.print("Buoc "+(i)+": ");
            for(int t=0;t<=i;t++)
            {
                System.out.print(a[t]+" ");
            }
            System.out.println(" ");
        }
        
    }
}