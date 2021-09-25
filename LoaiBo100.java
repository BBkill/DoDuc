// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class LoaiBo100 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         while(t-->0)
//         {
//             String s=sc.next();
//             String dd="100";
//             if(s.contains(dd))
//             {
//                 List<String> list=new ArrayList<String>();
//                 s=s+"   ";
//                 for(int i=0;i<s.length();i++)
//                 {
//                     list.add(s.charAt(i)+"");
//                 }
//                 long dem=0;
//                 for(int i=0;i<list.size()-3;i++)
//                 {
//                     if(list.get(i).equals("1")&&list.get(i+1).equals("0")&&list.get(i+2).equals("0"))
//                     {
//                         list.remove(i);
//                         list.remove(i);
//                         list.remove(i);
//                         i=-1;
//                         dem=dem+3;
//                     }
//                 }
//                 System.out.println(dem);
//             }
//             else
//             {
//                 System.out.println("0");
//             }
//         }
//     }
// }
