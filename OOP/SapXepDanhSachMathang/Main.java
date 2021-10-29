package SapXepDanhSachMathang;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        ArrayList<Goods> goodslist = new ArrayList<>();
        int numb=Integer.parseInt(input.nextLine());
        for (int i = 1; i <= numb; i++) {
            Goods goods = new Goods(i,input.nextLine(),input.nextLine(),Float.parseFloat(input.nextLine()),Float.parseFloat(input.nextLine()));
            goodslist.add(goods);
        }
        Stream<Goods> goodsStream = goodslist.stream().sorted();
        goodsStream.forEach(goods -> System.out.println(goods));
    }
}
