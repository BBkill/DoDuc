import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
        Collections.sort(ds);
        for (GiangVien giangVien : ds) {
            System.out.println(giangVien);
        }
    }
}
