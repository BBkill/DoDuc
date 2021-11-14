import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class SoNguyenToTrongFileNhiPhan{
    public static void main(String[] args) throws IOException, ClassNotFoundException  {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));

        TreeMap<Integer,Integer> map = new TreeMap<>();
        ArrayList<Integer> list = (ArrayList<Integer>) input.readObject();
        for (Integer integer : list) {
            if(check(integer))
            {
                if(map.containsKey(integer))
                {
                    map.put(integer, map.get(integer)+1);
                }
                else map.put(integer, 1);
            }
        }
        map.keySet().stream().forEach(key -> System.out.println(key+" "+map.get(key)));
        // Set<Integer> keyset = map.keySet();
        // for (Integer integer : keyset) {
        //     System.out.println(integer+" "+map.get(integer));
        // }

    }



    public static boolean check (int n)
    {
        if(n<2) return false;
        if(n==2) return true;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
}