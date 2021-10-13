import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.*;
public class LietKeVaDem{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map< Integer , Integer > map=new HashMap< Integer , Integer>();
        while(in.hasNextLine())
        {
            int n=in.nextInt();
            
            if(map.containsKey(n))
            {
                int tmp= map.get(n)+1;
                map.remove(n);
                map.put(n, tmp);
            } 
            else
            {
                map.put(n, 1);
            }
        }
        map.entrySet().stream().sorted(Collections.reverseOrder( Map.Entry.comparingByValue())).forEach(item -> System.out.println(item.getKey()+" "+item.getValue()));
        
    }
}
