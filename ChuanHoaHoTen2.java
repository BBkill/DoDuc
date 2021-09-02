     
// import java.util.*;
 
// public class ChuanHoaHoTen2 {
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
//                 else if(a[i-1] == ' '){
//                     ss=ss+(a[i]+"").toUpperCase();
//                 }else{
//                     ss=ss+(a[i]+"");
//                 }
//             }
//             list.add(ss);
//             //System.out.println(list.size());
//             for(int i=1;i<list.size()-1;i++)
//             {
//                 System.out.print(list.get(i)+" ");
//             }

//             System.out.println(list.get(list.size()-1)+", "+list.get(0).toUpperCase());
//         }
 
//         sc.close();
//     }
// }