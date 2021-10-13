import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStaff= Integer.parseInt(input.nextLine());
        ArrayList<StaffMan> staffList = new ArrayList<>();
        for(int i=1;i<=numberOfStaff;i++)
        {            
            StaffMan person= new StaffMan(i,input.nextLine(),input.nextLine(),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()));
            staffList.add(person);
        }
        for (StaffMan staffMan : staffList) {
            System.out.println(staffMan);
        }
    }
}
