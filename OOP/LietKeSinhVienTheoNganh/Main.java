
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amountOfStudent=Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> list= new ArrayList<>();
        for(int i=1;i<=amountOfStudent;i++)
        {
            SinhVien sinhVien=new SinhVien(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            list.add(sinhVien);
        }
        int t= Integer.parseInt(in.nextLine());
        while (t-->0)
        {
            String tmp =in.nextLine();
            tmp=tmp.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH "+tmp+":");
            for (SinhVien sinhvien: list) if(sinhvien.getMa().equals(tmp)) System.out.println(sinhvien);
        }
    }
}