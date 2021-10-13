import java.text.ParseException;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DateTimeException, ParseException {
        Scanner input =new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
       
        ArrayList<Athlete> listSorted = new ArrayList<>();
        for(int i=1;i<=test;i++)
        {
            
            Athlete athlete = new Athlete(i, input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
            
            listSorted.add(athlete);
        }
        Collections.sort(listSorted);
        int[] order = new int[test+1];
        order[listSorted.get(0).getId()-1]=1;
        for (int i=1;i<test;i++) {
            if(listSorted.get(i).totalTime()==listSorted.get(i-1).totalTime())
                order[listSorted.get(i).getId()-1]=order[listSorted.get(i-1).getId()-1];
            else order[listSorted.get(i).getId()-1]=i+1;
        }
        for (Athlete person : listSorted) {
            System.out.println(person+String.valueOf(order[person.getId()-1]));
        }

    }
}
