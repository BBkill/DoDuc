import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int AmountOfStudent = Integer.parseInt(input.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        ArrayList<Student> Sortedlist = new ArrayList<>();
        for(int i=1;i<=AmountOfStudent;i++)
        {
            Student student= new Student(i,input.nextLine(), Float.parseFloat(input.nextLine()));
            Sortedlist.add(student);
            list.add(student);
        }
        Collections.sort(Sortedlist);
        int[] order = new int[AmountOfStudent+1];
        order[Sortedlist.get(0).getIdCode()-1]=1;
        for (int i=1;i<AmountOfStudent;i++) {
           if(Sortedlist.get(i).getMark()==Sortedlist.get(i-1).getMark()) 
           {    
                order[Sortedlist.get(i).getIdCode()-1]=order[Sortedlist.get(i-1).getIdCode()-1];
           }
           else order[Sortedlist.get(i).getIdCode()-1]=i+1;  
        }

       

        for(Student  student : list) {
            System.out.print(student+" "+order[student.getIdCode()-1]);
            System.out.println();
        }
        
    }
}
