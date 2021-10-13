import java.math.BigInteger;
import java.util.Scanner;

public class BoiChung {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test= Integer.parseInt(in.nextLine());
        while(test-->0)
        {
            BigInteger firstNumb = in.nextBigInteger();
            BigInteger secondNumb= in.nextBigInteger();
            System.out.println(BCNN(firstNumb, secondNumb));
        }
    }
    static BigInteger BCNN(BigInteger firstNumb,BigInteger secondNumb)
    {
        return firstNumb.divide(UCLN(firstNumb, secondNumb)).multiply(secondNumb);
    }
    static BigInteger UCLN(BigInteger firstNumb,BigInteger secondNumb)
    {
        while(!firstNumb.multiply(secondNumb).equals(BigInteger.ZERO))
        {
            if(firstNumb.compareTo(secondNumb)>0) firstNumb=firstNumb.mod(secondNumb);
            else secondNumb=secondNumb.mod(firstNumb);
        }
        return firstNumb.add(secondNumb);
    }
}
