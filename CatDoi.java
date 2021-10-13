import java.util.*;
public class CatDoi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            String number = in.next();
            System.out.println(Split(number));
        }
    }

    static String Split(String number)
    {
        StringBuilder res= new StringBuilder();
        for(int i=0;i<number.length();i++)
        {
            if(number.charAt(i)=='0'||number.charAt(i)=='8'||number.charAt(i)=='9')
            {
                res.append("0");
            }
            else if(number.charAt(i)=='1')
            {
                res.append("1");
            }
            else return "INVALID";
        }
        String s=res.toString();
        long numb=Long.parseLong(s);
        if(numb==0) return "INVALID";
        return Long.toString(numb);
    }
}
