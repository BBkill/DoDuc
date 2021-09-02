// import java.util.Scanner;
// public class BoiSoNhoNhatCuaNSo {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         while(t>0)
//         {
//             long n=sc.nextLong();
//             long kq=1;
//             for(int i=2;i<=n;i++)
//             {
//                 kq=bc(kq,i);
//             }
//             System.out.println(kq);
//             t--;
//         }
//     }
//     public static long bc (long a,long b)
//     {
//         return a/uc(a,b)*b;
//     }
//     public static long uc (long a, long b)
//     {
//         while(a*b!=0)
//         {
//             if(a>b) a=a%b;
//             else b=b%a;
//         }
//         return a+b;
//     }
// }
