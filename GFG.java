import java.math.BigInteger;
  
public class GFG {
  
    public static void main(String[] args)
    {
  
        // Creating 2 BigInteger objects
        BigInteger b1, b2;
  
        b1 = new BigInteger("1221");
        b2 = new BigInteger("1234567891011121314151617181920212223242526272829");
  
        // apply mod() method
        BigInteger result = b2.mod(b1);
  
        // print result
        System.out.println("Result of mod operation between " + b1+ " and " + b2 +" equal to " + result);
    }
}