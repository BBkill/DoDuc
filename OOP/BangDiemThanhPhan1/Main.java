// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
//         int n = Integer.parseInt(in.nextLine());
//         for(int i=1;i<=n;i++)
//         {
//             SinhVien a=new SinhVien("", "", "", 0, 0,0);
//             a.setID(in.nextLine());
//             a.setName(in.nextLine());
//             a.setLop(in.nextLine());
//             a.setFirstMark(Float.parseFloat(in.nextLine()));
//             a.setSecondMark(Float.parseFloat(in.nextLine()));
//             a.setThirdMark(Float.parseFloat(in.nextLine()));
//             ds.add(a);
//         }
//         Collections.sort(ds);
//         int stt=1;
//         for (SinhVien sinhVien : ds) {
//             System.out.print(stt+" ");
//             stt++;
//             System.out.println(sinhVien);
//         }
//     }
// }
