import java.io.IOException;

import java.util.Scanner;
import java.io.*;
public class test1 {
    public static void main(String[] args) throws IOException {
       Scanner input = new Scanner(new File("DATA.in"));
       while(input.hasNextLine())
       {
           String s= input.nextLine();
           System.out.println(s);
       }
    }
}
