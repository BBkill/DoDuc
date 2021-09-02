// import java.util.Scanner;


// public class Hieu2SoNguyenLon {
//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);
//         String A=sc.next();
//         int a=A.length();
//         String B=sc.next();
//         int b=B.length();
//         while(a!=b)
//         {
//             if(a<b)
//             {
//                 A='0'+A;
//                 a++;
//             }
//             else 
//             {
//                 B='0'+B;
//                 b++;
//             }
//         }
//         Boolean dd=false;
//         for(int i=0;i<a;i++)
//         {
//             if(A.charAt(i)>B.charAt(i))
//             {
//                 dd=true;
//                 break;
//             }else if(A.charAt(i)<B.charAt(i))
//             {
//                 dd=false;
//                 break;
//             }
//         }
//         if(dd==true)
//         {

        
//         int nho=0;
//         int[] kq=new int[a];
//         for(int i=a-1;i>=0;i--)
//         {
//             if(A.charAt(i)-B.charAt(i)-nho<0)
//             {
//                 kq[i]=A.charAt(i)+10-B.charAt(i)-nho;
//                 nho=1;
//             }
//             else
//             {
//                 kq[i]=A.charAt(i)-B.charAt(i)-nho;
//                 nho=0;
//             }
//         }
//         int dem=0;
//         for(int i=0;i<a;i++)
//         {
//             if(kq[i]!=0) break;
//             else dem++;
//         }
//         if(dem!=a)
//         { 
//             for(int i=dem;i<a;i++) System.out.print(kq[i]);
//         }
//         else  System.out.print("0");
       
//     }
//     else
//     {
//         String Z;
//         Z=A;A=B;B=Z;
//         int nho=0;
//         int[] kq=new int[a];
//         for(int i=a-1;i>=0;i--)
//         {
//             if(A.charAt(i)-B.charAt(i)-nho<0)
//             {
//                 kq[i]=A.charAt(i)+10-B.charAt(i)-nho;
//                 nho=1;
//             }
//             else
//             {
//                 kq[i]=A.charAt(i)-B.charAt(i)-nho;
//                 nho=0;
//             }
//         }
//         int dem=0;
//         for(int i=0;i<a;i++)
//         {
//             if(kq[i]!=0) break;
//             else dem++;
//         }
//         if(dem!=a)
//         { 
//             System.out.print("-");
//             for(int i=dem;i<a;i++) System.out.print(kq[i]);
//         }
//         else  System.out.print("0");
            
        
//     }
       
//     }
// }

