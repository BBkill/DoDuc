import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int amountOfCosumer = Integer.parseInt(input.nextLine());
        ArrayList<ElectricTable> list = new ArrayList<>();
        for(int i=1;i<=amountOfCosumer;i++)
        {
            ElectricTable consumer= new ElectricTable(i,input.nextLine(), Long.parseLong(input.nextLine()), Long.parseLong(input.nextLine()));
            list.add(consumer);
        }
        for (ElectricTable consumer : list) {
            System.out.println(consumer);
        }
    }
}
