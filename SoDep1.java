// import java.util.Scanner;
// public class SoDep1 {
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
            
//             k=s.length()-1;

//             boolean check=true;
//             for(int i=0;i<=k/2;i++)
//             {
//                 if(((int)s.charAt(i)-48)%2!=0 || s.charAt(i)!=s.charAt(k-i) )
//                 {
//                     check=false;
//                 }
//             }
//             if(check==true) System.out.println("YES");
//             else System.out.println("NO");  
//             t--;
//         }
//     }
// }
