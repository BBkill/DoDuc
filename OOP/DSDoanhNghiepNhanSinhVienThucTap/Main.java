import java.util.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<DoanhNghiep> ds =new ArrayList<DoanhNghiep>();
        for(int i=1;i<=n;i++)
        {
            DoanhNghiep dn = new DoanhNghiep("","",0);
            dn.setCode(in.nextLine());
            dn.setName(in.nextLine());
            dn.setNumberofStudents(Integer.parseInt(in.nextLine()));
            ds.add(dn);
        }
        Collections.sort(ds);
        for (DoanhNghiep doanhNghiep : ds) {
            System.out.println(doanhNghiep);
        }
    }
}
