package DanhSachMonHoc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(input.nextLine());
        ArrayList<MonHoc> mhList = new ArrayList<>();
        for(int i=0;i<t;i++)
        {
            MonHoc monHoc = new MonHoc(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()));
            mhList.add(monHoc);
        }
        Collections.sort(mhList);
        mhList.stream().forEach(System.out::println);
    }
}
