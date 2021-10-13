import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> keyList=new ArrayList<>();
        Map<Integer,Integer> map= new HashMap<>();
        //for(int i=0;i<35;i++)
        while(input.hasNextInt())
        {
            int key = input.nextInt();
            if(map.containsKey(key)) 
            {
                map.put(key, map.get(key)+1);
            }   
            else
            {
                map.put(key, 1);
                if(check(key)) keyList.add(key);
            }
        }
        
        ArrayList<Number> valureList=new ArrayList<>();
        
        for (Integer key : keyList) {
            Number numb= new Number(key,map.get(key));
            valureList.add(numb);
        }
        Collections.sort(valureList);
        for (Number pair : valureList) {
            System.out.println(pair);
        }
    }
    static boolean check(int n)
    {
        String numb= Integer.toString(n);
        char tmp=numb.charAt(0);
        for(int i=1;i<numb.length();i++)
        {
            if(tmp>numb.charAt(i)) return false;
            tmp=numb.charAt(i);
        }
        return true;
    }
}
