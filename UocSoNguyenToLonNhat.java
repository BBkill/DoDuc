// import java.util.Scanner;
// public class UocSoNguyenToLonNhat {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         while(t>0)
//         {
//             long n=sc.nextLong();
//             long m=n,maxz=0;
//             for(long i=2;i*i<=n;i++)
//             {
//                 if(n%i==0)
//                 {
//                     maxz=i;
//                     while(n%i==0)
//                     {
//                         n=n/i;
//                     }
//                 }
//             }
//             if(n!=1&&n>maxz) maxz=n;
//             System.out.println(maxz);
//             t--;
//         }

//     }
// }
