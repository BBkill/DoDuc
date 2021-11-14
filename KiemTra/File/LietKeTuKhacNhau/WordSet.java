package LietKeTuKhacNhau;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
public class WordSet  {
    private String path,res="";
    WordSet(String path)
    {
        this.path=path;
    }

    private String getRes() throws IOException
    {
        Scanner input = new Scanner(new File(path));
        TreeSet<String> set = new TreeSet<>();
        while(input.hasNextLine())
        {
            String[] s = input.nextLine().trim().split("\\s+");
            for (String string : s) {
                set.add(string.toLowerCase());
            }
        }
        for (String string : set) {
            res = res+string+"\n";
        }
        return res;
    }

    @Override
    public String toString() {
        try {
            return getRes();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "";
    }
    
}
