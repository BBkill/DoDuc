// import java.util.*;

// public class TongUocSo {
//     static final int k = 2000005;
//     static int[] mPrime = new int[k];
//     public static void main(String[] args) {
//         Generator();
//         Sol();
//     }
//     static void Generator()
//     {
//         for(int i=2;i<k;i++)
//         {
//             if(mPrime[i]==0)
//             {
//                 for(int j=i*2;j<k;j=j+i)
//                 {
//                     if(mPrime[j]==0) mPrime[j]=i;
//                 }
//             }
//         }
//         for(int i=2;i<k;i++)  if(mPrime[i]==0) mPrime[i]=i;
//     }
//     static void Sol()
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         long an=0;
//         for(int i=0;i<n;i++)
//         {
//             int dd=sc.nextInt();
//             while(dd!=1)
//             {
//                 an=an+mPrime[dd];
//                 dd=dd/mPrime[dd];
//             }
//         }
//         System.out.println(an);
//     }
// }
