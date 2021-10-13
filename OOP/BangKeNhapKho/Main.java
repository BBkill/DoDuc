import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int items= Integer.parseInt(input.nextLine());
        ArrayList<Goods> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(int i=1;i<=items;i++)
        {
            Goods goods=new Goods(input.nextLine(), Long.parseLong(input.nextLine()), Long.parseLong(input.nextLine()));
            String key=goods.getNameCode();
            if(map.containsKey(key)) 
            {
                int tmp=map.get(key)+1;
                map.remove(key);
                map.put(key, tmp);
                goods.setId(tmp);
            }
            else
            {
                map.put(key, 1);
                goods.setId(1);
            } 
            list.add(goods);
        }
        for (Goods goods : list) {
            System.out.println(goods);
        }
    }
}
