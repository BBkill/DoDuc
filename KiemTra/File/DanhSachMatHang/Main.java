package DanhSachMatHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Good> list = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i=1;i<=t;i++)
        {
            Good goods = new Good(i, input.nextLine(), input.nextLine(), Long.parseLong(input.nextLine()), Long.parseLong(input.nextLine()));
            list.add(goods);
        }
    list.stream().sorted().forEach(System.out::println);
    }
}
