package KetQuaXetTuyen;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb = Integer.parseInt(input.nextLine());
        ArrayList<Student> studentList= new ArrayList<>();
        for (int i = 1; i <= numb; i++) {
            Student student = new Student(i,input.nextLine(),input.nextLine(),Float.parseFloat(input.nextLine()),Float.parseFloat(input.nextLine()));
            studentList.add(student);
        }
        studentList.stream().forEach(student -> System.out.println(student));
    }
}
