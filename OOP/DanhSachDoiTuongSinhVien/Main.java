import java.text.ParseException;
import java.util.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<SinhVien> ds= new ArrayList<SinhVien>();
        int n = Integer.parseInt(in.nextLine());
        for(int i=1;i<=n;i++)
        {
            SinhVien a=new SinhVien(i, in.nextLine(), in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()));
            ds.add(a);
        }
        for (SinhVien sinhVien : ds) {
            System.out.println(sinhVien);
        }
    }
}
