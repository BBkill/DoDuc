import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        ArrayList<Orders> list=new ArrayList<>();
        while(test-->0)
        {
            String name = input.nextLine();
            String code = input.nextLine();
            long pricePerProduct =  Long.parseLong(input.nextLine());
            long number = Long.parseLong(input.nextLine());
            Orders order = new Orders(name, code, pricePerProduct, number);
            list.add(order);
        }
        for (Orders orders : list) {
            System.out.println(orders);
        }
    }
}
