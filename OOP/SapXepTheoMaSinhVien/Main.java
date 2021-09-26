import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<SinhVien> ds=new ArrayList<>();
        while(input.hasNext())
        {
            SinhVien sinhvien=new SinhVien(input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine());
            ds.add(sinhvien);
        }
        Collections.sort(ds);
        for (SinhVien sinhVien : ds) {
            System.out.println(sinhVien);
        }
    }
}
