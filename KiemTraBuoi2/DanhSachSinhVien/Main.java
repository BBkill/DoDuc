package DanhSachSinhVien;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("SINHVIEN.in"));
        int t= Integer.parseInt(input.nextLine());
        ArrayList<SinhVien> svList = new ArrayList<>();
        for(int i=0;i<t;i++)
        {
            SinhVien sinhVien = new SinhVien(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
            svList.add(sinhVien);
        }
        Collections.sort(svList);
        for (SinhVien sinhVien : svList) {
            System.out.println(sinhVien);
        }
        input.close();
    }
}
