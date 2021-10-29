import java.math.BigInteger;
import java.util.Scanner;

public class ChiaHet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t= Integer.parseInt(input.nextLine());
        while(t-->0)
        {
            String numb1 = input.next();
            String num2 = input.nextLine().trim();
            BigInteger a = new BigInteger(numb1);
            BigInteger b = new BigInteger(num2);
        
            if(a.mod(b).toString().equals("0")||b.mod(a).toString().equals("0")) System.out.println("YES");
            else  System.out.println("NO");
        }
    }
}
