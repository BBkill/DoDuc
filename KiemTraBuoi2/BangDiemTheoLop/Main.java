package BangDiemTheoLop;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //Scanner inputSV = new Scanner(new File("SINHVIEN.in"));
        Scanner inputSV = new Scanner(new File("D:/ZJava/KiemTraBuoi2/BangDiemTheoLop/SINHVIEN.txt"));
        int t= Integer.parseInt(inputSV.nextLine());
        ArrayList<SinhVien> svList = new ArrayList<>();
        for(int i=0;i<t;i++)
        {
            SinhVien sinhVien = new SinhVien(inputSV.nextLine(), inputSV.nextLine(), inputSV.nextLine(), inputSV.nextLine());
            svList.add(sinhVien);
        }
        Scanner inputMH = new Scanner(new File("D:/ZJava/KiemTraBuoi2/BangDiemTheoLop/MONHOC.txt"));
        //Scanner inputMH = new Scanner(new File("MONHOC.in"));
        int t2 = Integer.parseInt(inputMH.nextLine());
        ArrayList<MonHoc> mhList = new ArrayList<>();
        for(int i=0;i<t2;i++)
        {
            MonHoc monHoc = new MonHoc(inputMH.nextLine(), inputMH.nextLine(), Integer.parseInt(inputMH.nextLine()));
            mhList.add(monHoc);
        }
        Scanner inputBD = new Scanner(new File("D:/ZJava/KiemTraBuoi2/BangDiemTheoLop/BANGDIEM.txt"));
        //Scanner inputBD = new Scanner(new File("BANGDIEM.in"));
        int t3 = Integer.parseInt(inputBD.nextLine());
        ArrayList<BangDiem> bdList = new ArrayList<>();
        for(int i=0;i<t3;i++)
        {
            BangDiem bangDiem = new BangDiem(inputBD.next(), inputBD.next(), inputBD.nextLine());
            bdList.add(bangDiem);
        }
        int t4 = Integer.parseInt(inputBD.nextLine());
        for(int i=0;i<t4;i++)
        {
            String lop = inputBD.nextLine().trim();
            System.out.println("BANG DIEM lop "+lop+":");
            for (SinhVien sinhVien: svList) {
                for (MonHoc monHoc : mhList) {
                    for (BangDiem bangDiem : bdList) {
                        if(bangDiem.getSvId().equals(sinhVien.getId())&&bangDiem.getMhId().equals(monHoc.getMhId()))
                        System.out.println(sinhVien.getId()+" "+sinhVien.rightName()+" " + monHoc + bangDiem.getPoint().trim());
                    }  
                    
                }
                
            }
        }

    }
}
