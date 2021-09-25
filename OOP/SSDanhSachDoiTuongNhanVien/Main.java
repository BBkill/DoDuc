import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        ArrayList<NhanVien> ds=new ArrayList<NhanVien>();
        int n=Integer.parseInt(in.nextLine());
        for(int i=1;i<=n;i++)
        {
            NhanVien nv = new NhanVien(i,in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            ds.add(nv);
        }
        Collections.sort(ds);
        for (NhanVien nhanVien : ds) {
            System.out.println(nhanVien);
        }
        
    }   
}
