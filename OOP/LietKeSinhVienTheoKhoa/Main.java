import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<SinhVien> ds=new ArrayList<>();
        int n=Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) 
        {
            SinhVien sinhvien=new SinhVien(input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine());
            ds.add(sinhvien);
        }
        int q=Integer.parseInt(input.nextLine());
        for (int i = 0; i < q; i++) {
            String Khoa=input.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA "+Khoa+":");
            for (SinhVien sinhVien : ds) {
                if(Khoa.equals(sinhVien.getKhoa()))
                    System.out.println(sinhVien);
            }
        }
        
    }
}
