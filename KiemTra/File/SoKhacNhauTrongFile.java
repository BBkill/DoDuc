import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SoKhacNhauTrongFile {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        Scanner input = new Scanner(new File("DATA.in"));
        Map<Integer,Integer> numMap  = new TreeMap<>();
        while(input.hasNextInt())
        {
            int key = input.nextInt();
            if(!numMap.containsKey(key)) numMap.put(key, 1);
            else numMap.put(key,numMap.get(key)+1);
        }
        numMap.keySet().forEach(key-> System.out.println(key+" "+numMap.get(key)));
    }
}
