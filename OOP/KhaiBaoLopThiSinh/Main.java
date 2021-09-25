import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner input=new Scanner(System.in);
        Students student = new Students( input.nextLine(), input.nextLine(), Float.parseFloat(input.nextLine()), Float.parseFloat(input.nextLine()), Float.parseFloat(input.nextLine()));
        System.out.println(student);
   }
}
