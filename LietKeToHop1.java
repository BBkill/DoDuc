// import java.util.*;
// public class LietKeToHop1 {
//     static int[] a=new int[20];
//     static int n,k;
//     static boolean check=false;
//     public static void main(String[] args) {
//         sol();
//     }
//     static void Init()
//     {
//         Scanner  sc = new Scanner(System.in);
//         n = sc.nextInt();
//         k = sc.nextInt();
//         for(int i=1;i<=k;i++) a[i]=i;
//     }
//     static void Print()
//     {
//         for(int i=1;i<=k;i++)
//         {
//             System.out.print(a[i]);
//         }
//         System.out.print(" ");
//     }
//     static void Generate()
//     {
//         int i=k;
//         while(i>0&&a[i]==n-k+i) i--;
//         if(i==0)
//         {
//             check=true;
//             return;
//         }
//         else{
//             a[i]++;
//             for(int j=i+1;j<=k;j++)
//             {
//                 a[j]=a[i]+j-i;
//             }
//         }
//         return;
//     }
//     static void sol()
//     {
//         Init();
//         int dem=0;
//         while(!check)
//         {
//             Print();
//             dem++;
//             Generate();
//         }
//         System.out.println();
//         System.out.print("Tong cong co "+dem+" to hop");
//     }


// }
