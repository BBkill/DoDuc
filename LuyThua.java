// import java.util.Scanner;

// public class LuyThua { 
//     static final long m=(long)((long)1e9+7);
//     //static final long m =100;
//     public static void main(String[] args) {
       
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
//     public static long power (long x, long y)
//     {
//         if(y==0) return 1;
//         if(y==1) return x;
//         long tmp=power(x,y/2);
//         if(y%2==0) return (tmp%m)*(tmp%m)%m;
//         else return ((tmp%m)*(((tmp%m)*(tmp%m))%m))%m;

//     }
// }
