import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int numberOfStaffMan = Integer.parseInt(input.nextLine());
        ArrayList<StaffMan> listOfStaffMan= new ArrayList<>();
        for(int i=1;i<=numberOfStaffMan;i++)
        {
            StaffMan men = new StaffMan(i, input.nextLine(), Long.parseLong(input.nextLine()), Long.parseLong(input.nextLine()), input.nextLine());
            listOfStaffMan.add(men);
        }
        long totalOfFinace = 0;
        for (StaffMan staffMan : listOfStaffMan) {
            System.out.println(staffMan);
            totalOfFinace=totalOfFinace+staffMan.total();
        }
        System.out.println("Tong chi phi tien luong: "+totalOfFinace);
    }    
}
