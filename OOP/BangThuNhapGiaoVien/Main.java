import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int numberOfTeachers= Integer.parseInt(input.nextLine());
        ArrayList<Teachers> list = new ArrayList<>();
        int numberOfChairmaster= 1, numberOfViceChairMaster=2;
        while(numberOfTeachers-->0)
        {
            Teachers teacher = new Teachers(input.nextLine(), input.nextLine(), Long.parseLong(input.nextLine()));
            if(teacher.Position().equals("HT")&&numberOfChairmaster==1)
            {
                list.add(teacher);
                numberOfChairmaster=0;
            }
            else if(teacher.Position().equals("HP")&&numberOfViceChairMaster>0)
            {
                list.add(teacher);
                numberOfViceChairMaster--;
            }
            else if(teacher.Position().equals("GV")) list.add(teacher);
            
        }
        for (Teachers teacher : list) {
            System.out.println(teacher);
        }
        
    }
}
