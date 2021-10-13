import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        ArrayList<Oil> list = new ArrayList<>();
        for(int i=1;i<=number;i++)
        {
            String[] tmp = input.nextLine().split("\\s+");
            Oil oil = new Oil(tmp[0], Long.parseLong(tmp[1]));
            list.add(oil);
        }
        Collections.sort(list);
        for (Oil oil : list) {
            System.out.println(oil);
        }
    }
}
