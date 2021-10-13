import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TuThuanNghichDaiNhat {
    static Scanner in;

    public static void main(String[] args) throws Exception {
        in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> keyList =  new ArrayList<>();
        ArrayList<Integer> valureList= new ArrayList<>();
        int maxx = 0;
        while (in.hasNext()) {
            String s = in.next();
            if (check(s)) {
                int tmp = s.length();
                maxx = (maxx >= tmp) ? maxx : tmp;
                
                if (!map.containsKey(s)) {
                    map.put(s, 1);keyList.add(s);
                } else {
                    map.put(s, map.get(s) + 1);
                    
                }
            }

        }

        for (String key : keyList) {
            if(key.length()==maxx)
                System.out.println(key+" "+map.get(key));
        }
    }

    static boolean check(String s) {
        String s1 = new StringBuilder(s).reverse().toString();
        return s.compareTo(s1) == 0;
    }

}