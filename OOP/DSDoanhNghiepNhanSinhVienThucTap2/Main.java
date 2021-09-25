import java.util.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
        int q=in.nextInt();
        for(int i=0;i<q;i++){

        
        int a = in.nextInt(),b=in.nextInt();
        if(a>b)
        {
            int c=a;a=b;b=c;
        }
        Collections.sort(ds);
        System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
        for (DoanhNghiep doanhNghiep : ds) {
            if(doanhNghiep.getNumberofStudents()>=a&&doanhNghiep.getNumberofStudents()<=b)
                System.out.println(doanhNghiep);
        }
    }
    }
}
