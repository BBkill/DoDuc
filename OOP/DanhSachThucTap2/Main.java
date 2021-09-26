import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<SinhVien> ds=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            SinhVien sinhVien = new SinhVien(i, input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine());
            ds.add(sinhVien);
        }
        int q= Integer.parseInt(input.nextLine());
        Collections.sort(ds);
        for(int i=0;i<q;i++)
        {
            String filter = input.nextLine();
            for (SinhVien sinhVien : ds) {
                if(filter.equals(sinhVien.getNameOfCompany()))
                    System.out.println(sinhVien);
            }
        }

    }
}
