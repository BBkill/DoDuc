import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TapTuRiengCuaHaiXau{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testNumber= Integer.parseInt(input.nextLine());
        for (int i = 0; i < testNumber; i++) {
            String firstStringList[]= input.nextLine().trim().split("\\s+");
            String secondStringList[] =input.nextLine().trim().split("\\s+");
            Set<String> filterList = new TreeSet<>();
            for (String string : firstStringList) {
                filterList.add(string);
            } 
            for (String string : secondStringList) {
                if(filterList.contains(string))
                {
                    filterList.remove(string);
                }
            }
            for (String string : filterList) {
                System.out.print(string+" ");
            }
            System.out.println();
        }
    }
}