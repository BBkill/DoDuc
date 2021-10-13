// import java.util.*;

// public class Ohnono {
//     public static void main(String[] args) {
//         Scanner x = new Scanner(System.in);
//         int n= Integer.parseInt(x.nextLine());
//         ArrayList<SinhVien> s= new ArrayList<>(n);
//         for (int i=0; i<n; i++){
//              SinhVien a = new SinhVien(x.nextLine(), x.nextLine(), x.nextLine(), Float.parseFloat(x.nextLine()));
//             s.add(a);
//         }
//        for (int i=0; i<n; i++){
//            System.out.println(s.get(i));
//        }
//     }
// }
 
// //import java.util.*;
// public class SinhVien {
//     private String name;
//     private String msv;
//     private String lop;
//     private String ngaysinh;
//     private float gpa;
//     private int id;
//     public static int dem=1;
//     SinhVien(){
//     }
//     public SinhVien(String name, String lop, String ngaysinh, float gpa) {
//         this.name = name;
//         this.lop = lop;
//         this.ngaysinh = ngaysinh;
//         this.gpa = gpa;
//         this.id=dem;
//         dem+=1;
//         msv="B20DCCN";
//     }
//     public String getMsv(){
//         String tmp="";
//         if(id<10){
//             tmp+="00"+id;
//         }
//         else if(id<100)
//             tmp+="0"+id;
//         else{
//             tmp+=id;
//             }
//         tmp=msv+tmp;
//         return tmp;
//     }
//     public String setngaysinh(String s){
//         String p[] = s.split("/");
//         String tmp="";
//         if(p[0].length()==1){
//             tmp+="0"+p[0]+"/";
//         }
//         else{
//             tmp+=p[0]+"/";
//         }
//         if(p[1].length()==1){
//             tmp+="0"+p[1]+"/";
//         }
//         else{
//             tmp+=p[1]+"/";
//         }
//         tmp+=p[2];
//         return tmp;
//     }
//     public String getName(String n){
//         String s=n.strip();
//         String ds[]= s.split("\\s+");
//         StringBuilder tmp = new StringBuilder();
//         for (int i=0; i< ds.length; i++){
//             tmp.append(Character.toUpperCase(ds[i].charAt(0)));
//             for (int j=1; j<ds[i].length(); j++){
//                 tmp.append(Character.toLowerCase(ds[i].charAt(j)));
//             }
//             tmp.append(" ");
//         }
//         tmp.deleteCharAt(tmp.length()-1);
//         return tmp.toString();
//     }
 
//     @Override
//     public String toString(){
//         return (getMsv()+" "+getName(name)+" "+lop+" "+setngaysinh(ngaysinh)+" "+String.format("%.2f", gpa));
//     }
// }
 