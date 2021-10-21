import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            Student student = new Student(input.nextLine(), input.nextLine(), input.nextLine());
            list.add(student);
        }
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String id = input.next();
            String dd= input.next();
            int total=10;
            for(int j=0;j<dd.length();j++)
            {
                if(dd.charAt(j)=='v') total=total-2;
                else if(dd.charAt(j)=='m') total = total-1;
            }
            if(total<0)
            {
                map.put(id, 0);
            }
            else map.put(id, total);
        }
        input.nextLine();
        String filter = input.nextLine();

        for (Student student : list) {
            if(student.getClassroom().equals(filter))
            {
                System.out.print(student);
            System.out.print(map.get(student.getIdCode())+" ");
            if(map.get(student.getIdCode())==0) System.out.println("KDDK");
            else System.out.println();
            }
            
        }

    }
}
