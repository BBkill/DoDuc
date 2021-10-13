import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amountOfStuff= Integer.parseInt(input.nextLine());
        ArrayList<StuffTable> tables = new ArrayList<>();
        for(int i=1;i<=amountOfStuff;i++)
        {
            StuffTable unit = new StuffTable(i, input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine()));
            tables.add(unit);
        }
        Collections.sort(tables);
        for (StuffTable stuff : tables) {
            System.out.println(stuff);
        }
    }
}
