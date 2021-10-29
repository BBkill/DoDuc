import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfDepart = Integer.parseInt(input.nextLine());
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < numberOfDepart; i++) {
            map.put(input.next().trim().toUpperCase(), input.nextLine().trim());
        }
        int numberOfStaff = Integer.parseInt(input.nextLine());
        ArrayList<Salary> list = new ArrayList<>();
        for (int i = 0; i < numberOfStaff; i++) {
            Salary staff = new Salary(input.nextLine(), input.nextLine(), Long.parseLong(input.nextLine()), Long.parseLong(input.nextLine()));
            list.add(staff);
        }
        String filter = input.nextLine();
        System.out.println("Bang luong phong "+map.get(filter)+":");
        for (Salary staff : list) {
            if(staff.getDeparment().equals(filter))
                System.out.println(staff.getCode()+" "+staff.getName()+" "+staff.getTotalSalary());  
        }

    }
}
