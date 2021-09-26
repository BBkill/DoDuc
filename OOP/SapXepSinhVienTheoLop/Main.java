import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=Integer.parseInt(input.nextLine());
        ArrayList<SinhVien> ds=new ArrayList<>();
        for(int i=0;i<n;i++)
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
