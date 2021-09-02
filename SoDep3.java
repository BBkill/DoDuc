// import java.util.Scanner;

// public class SoDep3 {
//     public static void main(String[] args) 
//     {
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
//             for(int i=0;i<=k/2;i++)
//             {
//                 if(s.charAt(i)!=s.charAt(k-i-1) )
//                 {
//                     check=false;
//                     break;
//                 }
//                 if(s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='5'||s.charAt(i)=='7') check=true;
//                 else 
//                 {
//                     check=false;
//                     break;
//                 }
//             }
//             if(check==true) System.out.println("YES");
//             else System.out.println("NO");  
//             t--;
//         }

//     }    
// }
