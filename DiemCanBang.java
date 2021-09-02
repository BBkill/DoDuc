// import java.util.Scanner;
 
// public class DiemCanBang {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int  t = sc.nextInt();
//         while (t-- > 0){
//             int n = sc.nextInt();
//             int[] a = new int[n];
//             int sum = 0;
//             for(int i = 0; i < n; i++) {
//                 a[i] = sc.nextInt();
//                 sum += a[i];
//             }
//             int l = 0;
//             boolean ok = true;
//             for(int i = 0; i < n; i++){
//                 int x = sum - a[i];
//                 if(x %2==0 && l == x/2){
//                     System.out.println(i+1);
//                     ok = false;
//                     break;
//                 }
//                 l += a[i];
//             }
//             if(ok) System.out.println(-1);
 
//         }
//     }
// }