import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test= Integer.parseInt(in.nextLine());
        ArrayList<StudentList> list =new ArrayList<>();
        for(int i=1;i<=test;i++)
        {
            StudentList student = new StudentList(in.nextLine(), in.nextLine());
            list.add(student);
        }
        Collections.sort(list);
        for (StudentList studentList : list) {
            System.out.println(studentList);
        }
    }
}
