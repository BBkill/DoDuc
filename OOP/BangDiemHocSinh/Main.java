import java.util.*;
import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList <SinhVien> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) 
        {
            String ten = in.nextLine();
            String bangDiem[] = in.nextLine().split("\\s+");
            SinhVien a = new SinhVien(i, ten, bangDiem);
            ds.add(a);
        }
        Collections.sort(ds);
        for(SinhVien i : ds) 
        {
            System.out.println(i);
        }
        
    }
}
