package HopGiaoCua2FileVanBan;

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

    public String union(WordSet o) throws IOException
    {
        String[] s1= getRes().trim().split("\\s+");
        String[] s2= o.getRes().trim().split("\\s+");
        TreeSet<String> set = new TreeSet<>();
        for (String word : s1) {
            set.add(word);
        }
        for (String word : s2) {
            set.add(word);
        }
        StringBuilder result = new StringBuilder();
        for (String string : set) {
            result.append(string+" ");
        }
        return result.toString().trim();
    }

    public String intersection(WordSet o) throws IOException
    {
        String[] s1= getRes().trim().split("\\s+");
        String[] s2= o.getRes().trim().split("\\s+");        
        TreeSet<String> set = new TreeSet<>();
        for (String word : s1) {
            set.add(word);
        }
        StringBuilder result = new StringBuilder();     
        for (String word : s2) {
            if(set.contains(word))
            {
                result.append(word+" ");
                set.remove(word);
            }
        } 
        
        
        return result.toString().trim();          
        
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
