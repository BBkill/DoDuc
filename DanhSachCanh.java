// import java.util.*;
// public class DanhSachCanh {
//     static int n;
//     static int[][] a=new int[1001][1001];

//     public static void main(String[] args) {
//         Init();
//         sol();
//     }
//     static void Init()
//     {
//         Scanner sc=new Scanner(System.in);
//         n=sc.nextInt();
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=n;j++)
//             {
//                 a[i][j]=sc.nextInt();
//             }
//         }
//     }
//     static void sol()
//     {
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=i;j<=n;j++)
//             {
//                 if(a[i][j]==1)
//                 {
//                     System.out.println("("+i+","+j+")");
//                 }
//             }
//         }
//     }
// }
