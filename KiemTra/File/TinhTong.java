import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) throws IOException {
        Scanner input=  new Scanner(new File("DATA.in"));
        long sum= 0;
        while(input.hasNext())
        {
            String tmp = input.next();
            try {
                sum=sum+(long)Integer.parseInt(tmp);
            } catch (Exception e) {
                continue;
            }
            
        }
        System.out.println(sum);
        input.close();
    }
}
