// import java.util.Scanner;
// public class UocSoChiaHetCho2 {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int t=sc.nextInt();
//         while(t>0)
//         {
//             long dem=0;
//             long n=sc.nextLong();
//             if(n%2==0) dem++;
//             for(long i=2;i*i<=n;i++)
//             {
//                 if(n%i==0&&i*i!=n)
//                 {
//                     if(i%2==0) dem++;
//                     if((n/i)%2==0) dem++;
//                 }
//                 else if(i*i==n)
//                 {
//                     if(i%2==0) dem++;
//                 }
//             }
//             System.out.println(dem);
//             t--;
//         }
//     }
// }
