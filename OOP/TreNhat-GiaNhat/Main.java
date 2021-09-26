import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DateTimeException, ParseException {
        Scanner input= new Scanner(System.in);
        ArrayList<AgeOfPerson> ds=new ArrayList<>();
        int n=Integer.parseInt(input.nextLine());
        for(int i=0;i<n;i++)
        {
            String s=input.nextLine();
            String tmp[]=s.trim().split("\\s+");
            AgeOfPerson person=new AgeOfPerson("", "00/00/0000");
            person.setDayOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse(tmp[1]));
            person.setName(tmp[0]);
            ds.add(person);
        }System.out.println(Collections.max(ds).getName());
        System.out.println(Collections.min(ds).getName());
        
        
    }
}
