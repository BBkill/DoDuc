import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int amountOfStudent=input.nextInt(), amountOfTeam=input.nextInt();
        ArrayList<StudentsList> studentList =new ArrayList<>();
        input.nextLine();
        for(int i=1;i<=amountOfStudent;i++)
        {
            StudentsList student =new StudentsList(input.nextLine(),input.nextLine(),input.nextLine(),Integer.parseInt(input.nextLine()),"");
            studentList.add(student);
        }
        String[] contentList=new String[amountOfTeam+1];
        for(int i=1;i<=amountOfTeam;i++)
        {
            contentList[i]=input.nextLine();
        }
        int q=Integer.parseInt(input.nextLine());
        for(int i=1;i<=q;i++)
        {
            int orderTeam = Integer.parseInt(input.nextLine());
            System.out.println("DANH SACH NHOM "+orderTeam+":");
            for (StudentsList student  : studentList) {
                if(orderTeam==student.getOrder())
                    System.out.println(student);
            }
            System.out.println("Bai tap dang ky: "+contentList[orderTeam]);
        }

    }
}
