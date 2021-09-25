
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<SinhVien> ds =new ArrayList<>();
        int n=Integer.parseInt(input.nextLine());
        for(int i=1;i<=n;i++)
        {
            SinhVien sv= new SinhVien(0,"","","",0);
            sv.setMsv(i);
            sv.setHoTen(input.nextLine());
            sv.setLop(input.nextLine());
            sv.setNgaySinh(input.nextLine());
            sv.setGPA(Float.parseFloat(input.nextLine()));
            ds.add(sv);
        }
        for (SinhVien sinhVien : ds) {
            System.out.println(sinhVien);
        }
        
    }
}
