// import java.util.Scanner;

// public class LuyThua { 
//     static final long M=(long)((long)1e9+7);
//         public static void main(String[] args) {
       
//         Scanner sc=new Scanner(System.in);
//         while(true)
//         {
//             long a=sc.nextLong(),b=sc.nextLong();
//             if(a==0&&b==0)
//             {
//                 break;
//             }
//             else
//             {
//                 System.out.println(power(a,b));
//             }
//         }
//     }
//     public static long power (long n, long k)
//     {
//         if(k==0)
//             return 1;
//         long x = power(n,k/2);
//         if(k%2==0)
//             return x*x%M;
//         return x*x%M*n%M;

//     }
// }
