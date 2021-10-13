import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        ArrayList<SortTime> timeList=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            SortTime time=new SortTime(input.nextLong(),input.nextLong(),input.nextLong());
            timeList.add(time);
        }
        Collections.sort(timeList);
        for (SortTime time : timeList) {
            System.out.println(time);
        }
    }
}
