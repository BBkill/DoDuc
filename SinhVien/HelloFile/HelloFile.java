
import java.io.FileInputStream;
import java.util.Scanner;

public class HelloFile {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(new FileInputStream("Hello.txt"));
        while(input.hasNextLine())
        {
            String s=input.nextLine();
            System.out.println(s);
        }
        
    }
}
