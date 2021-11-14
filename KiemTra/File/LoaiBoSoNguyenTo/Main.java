package LoaiBoSoNguyenTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner( new File("DATA.in"));
        ArrayList<String> set = new ArrayList<>();
        while(input.hasNextLine())
        {
            String[] tmp = input.nextLine().trim().split("\\s+");
            for(String word : tmp)
            {
            
                try {
                    int i = Integer.parseInt(word);
                } catch (Exception e) {
                    set.add(word);
                  
                }
            }
        }
        Collections.sort(set);
        StringBuilder res = new StringBuilder();
        for (String string : set) {
            res.append(string+" ");
        }
        System.out.println(res.toString().trim());
    }
}
