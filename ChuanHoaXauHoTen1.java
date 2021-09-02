     
// import java.util.Scanner;
 
// public class ChuanHoaXauHoTen1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         sc.nextLine();
//         while(t-- > 0){
//             String s = sc.nextLine();
//             s = " " + s.trim().replaceAll(" +", " ").toLowerCase();
//             char[] a = s.toCharArray();
//             for(int i = 1; i < a.length; i++){
//                 if(a[i-1] == ' '){
//                     System.out.print((a[i]+"").toUpperCase());
//                 }else{
//                     System.out.print(a[i]);
//                 }
//             }
//             System.out.println();
 
//         }
 
//         sc.close();
//     }
// }