package SoNguyenToLonNhatTrongFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

public class SoNguyenTo{
    public static void main(String[] args)  throws IOException,FileNotFoundException, ClassNotFoundException  {
        ObjectInputStream input = new ObjectInputStream( new FileInputStream("DATA.in"));
        ArrayList<Integer> list =  (ArrayList<Integer>) input.readObject();
        TreeMap<Integer,Integer> map =new TreeMap<>();
        for (Integer integer : list) {
            if(isPrime(integer))
            {
                if(map.containsKey(integer))
                {
                    map.put(integer, map.get(integer)+1);
                }
                else map.put(integer, 1);
            }
        }
        for(int i=0;i<10;i++)
        {
            System.out.println (map.lastKey()+" "+map.get(map.lastKey()));
            map.remove(map.lastKey());
        }
    }
    
    static boolean isPrime(int n)
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