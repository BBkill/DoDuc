     
// import java.util.*;
 
// public class DiaChiMail {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         sc.nextLine();
//         while(t-- > 0){
//             String s = sc.nextLine();
//             s = " " + s.trim().replaceAll(" +", " ").toLowerCase();
//             char[] a = s.toCharArray();
//             String ss="";
//             ArrayList<String> list =new ArrayList<>();
//             for(int i = 1; i < a.length; i++){
//                 if(a[i]==' ')
//                 {
//                     list.add(ss);
//                     ss="";
//                 }
//                 else{
//                     ss=ss+(a[i]+"");
//                 }
//             }
//             list.add(ss);
//             //System.out.println(list.size());
//             System.out.print(list.get(list.size()-1));
//             for(int i=0;i<list.size()-1;i++)
//                 System.out.print(list.get(i).charAt(0));
//             System.out.println("@ptit.edu.vn");
//         }
 
//         sc.close();
//     }
// }