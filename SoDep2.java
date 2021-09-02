// import java.util.Scanner;
// public class SoDep2 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         while(t>0)
//         {
//             String s=sc.next();
//             int k=s.length();
//             int dem=-1;
//             for(int i=0;i<k;i++)
//             {
//                 if(s.charAt(i)=='0')
//                 {
//                     dem=i;
//                 }
//                 else break;
//             }
//             s=s.substring(dem+1);
            
//             k=s.length();

//             boolean check=true;
//             long sum=0;
//             for(int i=0;i<k/2;i++)
//             {
//                 if(s.charAt(0)!='8' || s.charAt(i)!=s.charAt(k-i-1) )
//                 {
//                     check=false;
//                     break;
//                 }
//                 sum=sum+(long)(s.charAt(i)-'0')*2;
//             }
//             if(k%2==1&&check!=false)
//             {
//                 sum=sum+(long)(s.charAt(k/2+1)-'0');
//             }
//             if(sum%10!=0) check=false; 
           
//             if(check==true) System.out.println("YES");
//             else System.out.println("NO");  
//             t--;
//         }
//     }
// }
