import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int amountOfStudents = Integer.parseInt(input.nextLine());
        ArrayList<Student> studentList =new ArrayList<>();
        for(int i=1;i <= amountOfStudents;i++)
        {
            Student student=new Student(input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine());
            studentList.add(student);
        }
        int amountOfFilter = Integer.parseInt(input.nextLine());
        for(int i=0;i<amountOfFilter;i++)
        {   
            String sub=input.nextLine();
            String tmp[]=sub.trim().split("\\s+");
            String Subject=(tmp[0].charAt(0)+"").toUpperCase()+(tmp[1].charAt(0)+"").toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH "+sub.replaceAll("\\s\\s+", " ").trim().toUpperCase()+":");
            for (Student student : studentList) {
                if(Subject.equals(student.getSubject()) && student.CheckCLC())
                {
                    System.out.println(student);
                }
            }
        }
    }
}