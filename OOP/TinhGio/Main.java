import java.util.*;
import java.util.concurrent.TimeoutException;
import java.text.*;
public class Main {
    public static void main(String[] args) throws TimeoutException, ParseException {
        Scanner input =new  Scanner(System.in);
        int numberOfPlayer = Integer.parseInt(input.nextLine());
        ArrayList<AmountOfTime> timeList=new ArrayList<>();
        for(int i=0;i<numberOfPlayer;i++)
        {
            AmountOfTime dental = new AmountOfTime(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
            timeList.add(dental);
        }
        Collections.sort(timeList);
        for (AmountOfTime list : timeList) {
            System.out.println(list);
        }
    }
}
