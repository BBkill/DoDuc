import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Map;

import java.util.TreeMap;

public class SoKhacNhauTrongFile2{
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(new FileInputStream("DATA.IN"));
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<100000;i++)
        {
            int key=input.readInt();
            if(map.containsKey(key))
            {
                map.put(key, map.get(key)+1);
            }
            else map.put(key,1);
        }
        map.keySet().stream().forEach(key -> System.out.println(key+" "+map.get(key)));
        // int a[]=new int[1000];
        // for(int i=0;i<100000;i++)
        // {
        //     a[input.readInt()]++;
        // }
        // for (int i =0;i<1000;i++) {
        //     if(a[i]>0) System.out.println(i+" "+a[i])   ;
        // }
    }
}