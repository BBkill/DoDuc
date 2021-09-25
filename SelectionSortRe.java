// import java.util.Scanner;
// public class SelectionSortRe {
//     public static void main(String[] args) {
//         sol();
//     }
//     static void sol()
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] a=new int[100];
//         for(int i=0;i<n;i++)
//         {
//             a[i]=sc.nextInt();
//         }
//         int[][] an=new int[101][101];
//         for(int i=0;i<n-1;i++)
//         {
//             int k=i;
//             for(int j=i+1;j<n;j++)
//             {
//                 if(a[j]<a[k]) k=j;
//             }
//             int b=(int)0;
//             b=a[k];a[k]=a[i];a[i]=b;
//             for(int j=0;j<n;j++)
//             {
//                 an[i][j]=a[j];
//             }
//         }
//         System.out.print("Buoc "+(n-1)+": ");
//         for(int i=0;i<n;i++)
//         {
//             System.out.print(a[i]+" ");
//         }
//         System.out.println();
//         for(int i=n-3;i>=0;i--)
//         {
//             System.out.print("Buoc "+(i+1)+": ");
//             for(int j=0;j<n;j++)
//             {
//                 System.out.print(an[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

// }
