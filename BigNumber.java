// import java.math.BigInteger;
// import java.util.*;
// public class BigNumber {
//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         while(t-->0)
//         {
//             BigInteger A=new BigInteger(sc.next());
//             BigInteger B=new BigInteger(sc.next());
//             if(A.compareTo(B)>0)
//             {
//                 long a=A.longValue();
//                 long b=B.longValue();
//                 while(a*b!=0)
//                 {
//                     if(a>b) a=a%b;
//                     else b=b%a;
//                 }
//                 System.out.println(a+b);
//             }
//             else
//             {
//                 B=B.mod(A);
//                 long a=A.longValue();
//                 long b=B.longValue();
//                 while(a*b!=0)
//                 {
//                     if(a>b) a=a%b;
//                     else b=b%a;
//                 }
//                 System.out.println(a+b);
//             }
            
        
//         }
//     }
// }
