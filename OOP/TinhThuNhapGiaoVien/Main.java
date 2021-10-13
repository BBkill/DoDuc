import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Teachers teacher = new Teachers(input.nextLine(), input.nextLine(), Long.parseLong(input.nextLine()));
        System.out.println(teacher);
    }
}
