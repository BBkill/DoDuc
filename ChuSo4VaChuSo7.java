import java.util.Scanner;

public class ChuSo4VaChuSo7{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        byte so4=0,so7=0;
        for (int i=0;i<s.length();i++) {
            if(s.charAt(i)=='4') so4++;
            else if(s.charAt(i)=='7') so7++;
        }
        if(so4+so7==4||so4+so7==7) System.out.println("YES");
        else System.out.println("NO");
    }    
}