// import java.util.Scanner;
// public class SapXepNoiBot{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] a=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             a[i]=sc.nextInt();
//         }
//         boolean check=false;
//         for(int i=0;i<n-1;i++)
//         {
//             check=false;
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
//             System.out.print("Buoc "+(i+1)+": ");
//             for(int t=0;t<n;t++)
//             {
//                 System.out.print(a[t]+" ");
//             }
//             System.out.println(" ");
            
//         }
        
//     }
// }