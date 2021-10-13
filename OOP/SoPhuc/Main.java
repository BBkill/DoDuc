import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        ArrayList<String> list =new ArrayList<>();
        while(test-->0)
        {
            ComplexNumber first = new ComplexNumber(input.nextInt(),input.nextInt());
            ComplexNumber second = new ComplexNumber(input.nextInt(),input.nextInt());
            StringBuilder tmp = new StringBuilder();
            if(ComplexNumber.B1(first,second)<0) 
            {
                tmp.append(String.valueOf(ComplexNumber.A1(first,second))+" - "+String.valueOf(ComplexNumber.B1(first, second)*(-1))+"i, ");
            }
            else tmp.append(String.valueOf(ComplexNumber.A1(first,second))+" + "+String.valueOf(ComplexNumber.B1(first, second))+"i, ");
            if(ComplexNumber.B2(first,second)<0) 
            {
                tmp.append(String.valueOf(ComplexNumber.A2(first,second))+" - "+String.valueOf(ComplexNumber.B2(first, second)*(-1))+"i");
            }
            else tmp.append(String.valueOf(ComplexNumber.A2(first,second))+" + "+String.valueOf(ComplexNumber.B2(first, second))+"i");
            list.add(tmp.toString());
        }
        for (String string : list) {
            System.out.println(string);
        }
    }
}
