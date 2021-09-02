// import java.util.*;
// public class XauNhiPhan {
//     static long[] f=new long[100];
//     public static void main(String[] args) {
//         Fibo();
//         sol();
//     }
//     static void Fibo()
//     {
//         f[0]=0;
//         f[1]=1;
//         f[2]=1;
//         for(int i=3;i<93;i++)
//         {
//             f[i]=f[i-1]+f[i-2];
//         }
//     }
//     static void sol()
//     {
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         while(t-->0)
//         {
//             int n=sc.nextInt();
//             long k=sc.nextLong();
//             while(n>2)
//             {
//                 if(k<=f[n-2]) n=n-2;
//                 else
//                 {
//                     k=k-f[n-2];
//                     n=n-1;
//                 }
//             }
//             if(n==1) System.out.println("0");
//             else System.out.println("1");
//         } 
//     }

// }
