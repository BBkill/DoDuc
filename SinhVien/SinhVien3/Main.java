
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<SinhVien> ds =new ArrayList<>();
        int n=Integer.parseInt(input.nextLine());
        for(int i=1;i<=n;i++)
        {
            SinhVien sv= new SinhVien(i,input.nextLine(),input.nextLine(),input.nextLine(),Float.parseFloat(input.nextLine()));
            ds.add(sv);
        }
        Collections.sort(ds);
        for (SinhVien sinhVien : ds) {
            System.out.println(sinhVien);
        }
        
    }
}
