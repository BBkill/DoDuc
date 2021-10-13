import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int test= Integer.parseInt(input.nextLine());
        ArrayList<Goods> list =new ArrayList<>();
        for(int i=1;i<=test;i++)
        {
            Goods goods = new Goods(input.nextLine(), Double.parseDouble(input.nextLine()));
            list.add(goods);
        }
        Collections.sort(list);
        String filter = input.nextLine();
        for (Goods goods : list) {
            if(filter.equals(goods.getCode()))
            System.out.println(goods);
        }
    }
}
