import java.util.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<SinhVien> ds= new ArrayList<SinhVien>();
        int n = Integer.parseInt(in.nextLine());
        for(int i=1;i<=n;i++)
        {
            SinhVien a=new SinhVien(0, "", "", "", 0);
            a.setID(i);

            a.setName(in.nextLine());
            a.setLop(in.nextLine());
            a.setDoB(in.nextLine());
            a.setGPA(Float.parseFloat(in.nextLine()));

            ds.add(a);
        }
        for (SinhVien sinhVien : ds) {
            System.out.println(sinhVien);
        }
    }
}
