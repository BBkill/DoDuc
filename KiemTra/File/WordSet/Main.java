package WordSet;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

class WordSet {
    private String res;

    public WordSet(String res) {
        this.res = res.toLowerCase();
    }

    
    public String union(WordSet o) {
        String[] s1 = res.trim().split("\\s+");
        String[] s2 = o.res.trim().split("\\s+");
        TreeSet<String> set = new TreeSet<>();
        for (String word : s1) {
            set.add(word);
        }
        for (String word : s2) {
            set.add(word);
        }
        StringBuilder result = new StringBuilder();
        for (String string : set) {
            result.append(string + " ");
        }
        return result.toString().trim();
    }

    public String intersection(WordSet o) {
        String[] s1 = res.trim().split("\\s+");
        String[] s2 = o.res.trim().split("\\s+");
        TreeSet<String> set = new TreeSet<>();
        for (String word : s1) {
            set.add(word);
        }
        StringBuilder result = new StringBuilder();
        for (String word : s2) {
            if (set.contains(word)) {
                result.append(word + " ");
                
            }
        }

        return result.toString().trim();

    }

}
