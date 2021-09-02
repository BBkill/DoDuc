// import java.util.Scanner;

// public class Tong2SoNguyenLon {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         //int t=sc.nextInt();
//         //while(t>0)
//         //{
//             String A=sc.next();
//             int a=A.length();
//             String B=sc.next();
//             int b=B.length();
//             while(a!=b)
//             {
//                 if(a<b)
//                 {
//                     A='0'+A;
//                     a++;
//                 }
//                 else 
//                 {
//                     B='0'+B;
//                     b++;
//                 }
//             }
//             int nho=0;
//             int[] kq=new int[a];
//             for(int i=a-1;i>=0;i--)
//             {
//                 if(A.charAt(i)-'0'+B.charAt(i)-'0'+nho>9)
//                 {
//                     kq[i]=A.charAt(i)-'0'+B.charAt(i)-'0'+nho-10;
//                     nho=1;
//                 }
//                 else
//                 {
//                     kq[i]=A.charAt(i)-'0'+B.charAt(i)-'0'+nho;
//                     nho=0;
//                 }
//             }
//             int dem=0;
//             if(nho!=1) for(int i=0;i<a;i++)
//             {
//                 if(kq[i]!=0) break;
//                 else dem++;
//             }
//             if(dem!=a)
//             {
//                 if(nho==1) System.out.print("1");
//                 for(int i=dem;i<a;i++) System.out.print(kq[i]);
//             }
//             else System.out.print("0");
            
//             //t--;
//             //System.out.println(" ");
//        //}
//     }
// }
