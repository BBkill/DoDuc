// import java.util.Scanner;
// public class BubbleSortRe {
//     public static void main(String[] args) {
//         //Scanner input=new Scanner(System.in);
//         //int t=input.nextInt();
//         //while(t-->0)
//             sol();
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
//         boolean check=false;
//         int tmp=0;
//         for(int i=0;i<n-1;i++)
//         {
//             check=false;
//             tmp++;
//             for(int j=0;j<n-i-1;j++)
//             {
//                 if(a[j]>a[j+1])
//                 {
//                     int b=(int)0;
//                     b=a[j];a[j]=a[j+1];a[j+1]=b;
//                     check=true;
//                 }
//             }
//             if(check==false) break;
//             for(int t=0;t<n;t++)
//             {
//                 an[i][t]=a[t];
//             }
//         }
//         if(tmp==1)
//         {
//             System.out.print("Buoc "+tmp+": ");
//             for(int i=0;i<n;i++)
//             {
//                 System.out.print(a[i]+" ");
//             }
//             System.out.println();
//         }
//         else for(int i=tmp-2;i>=0;i--)
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
