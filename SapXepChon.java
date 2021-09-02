// import java.util.Scanner;
// public class SapXepChon{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] a=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             a[i]=sc.nextInt();
//         }
//         for(int i=0;i<n-1;i++)
//         {
//             int k=i;
//             for(int j=i+1;j<n;j++)
//             {
//                 if(a[j]<a[k]) k=j;

//             }
//             int b=(int)0;
//             b=a[k];a[k]=a[i];a[i]=b;
//             System.out.print("Buoc "+(i+1)+": ");
//             for(int j=0;j<n;j++)
//             {
//                 System.out.print(a[j]+" ");
//             }
//             System.out.println(" ");
//         }
        
//     }
// }