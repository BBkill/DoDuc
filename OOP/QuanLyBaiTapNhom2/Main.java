import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int amountOfStudent=input.nextInt(), amountOfTeam=input.nextInt();
        ArrayList<StudentsList> studentList =new ArrayList<>();
        input.nextLine();
        for(int i=1;i<=amountOfStudent;i++)
        {
            StudentsList student =new StudentsList(input.nextLine(),input.nextLine(),input.nextLine(),Integer.parseInt(input.nextLine()));
            studentList.add(student);
        }
        String[] contentList=new String[amountOfTeam+1];
        for(int i=1;i<=amountOfTeam;i++)
        {
            contentList[i]=input.nextLine();
        }
        Collections.sort(studentList);
        for (StudentsList student : studentList) {
            System.out.print(student);
            System.out.println(contentList[student.getOrder()]);
        }

    }
}
