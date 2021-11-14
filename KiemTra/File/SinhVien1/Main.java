package SinhVien1;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException, ParseException {
        Scanner input = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(input.nextLine());
        ArrayList<SinhVien> listSV = new ArrayList<>();
        for(int i=1;i<=t;i++)
        {
            SinhVien sinhvien = new SinhVien(i, input.nextLine(), input.nextLine(), input.nextLine(), Float.parseFloat(input.nextLine()));
            listSV.add(sinhvien);
        }
        listSV.stream().forEach(System.out::println);
    }
}