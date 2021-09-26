import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        ArrayList<GiangVien> ds = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            GiangVien gv=new GiangVien(i,input.nextLine(),input.nextLine());
            ds.add(gv);
        }
        int q=Integer.parseInt(input.nextLine());
        for(int i=0;i<q;i++)
        {
            String tmp=GiangVien.codeDeparment(input.nextLine());
            System.out.println("DANH SACH GIANG VIEN BO MON "+tmp+":");
            for (GiangVien giangVien : ds) {
                if(tmp.equals(giangVien.getDeparment()))
                    System.out.println(giangVien);
        }
        }
        
    }
}
