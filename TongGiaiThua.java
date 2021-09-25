import java.math.BigInteger;
import java.util.*;
public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        BigInteger bigAns = BigInteger.valueOf(0);
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            bigAns=bigAns.add(factorial(BigInteger.valueOf((long)i)));
        } 
        System.out.println(bigAns);
    }
    public static BigInteger factorial(BigInteger number) {
        BigInteger result = BigInteger.valueOf(1);

        for (long factor = 2; factor <= number.longValue(); factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
        return result;
    }
}
