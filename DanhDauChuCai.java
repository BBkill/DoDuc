import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s = in.next();
        Set<Character> list= new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            list.add(s.charAt(i));
        }
        System.out.println(list.size());
    }
}
