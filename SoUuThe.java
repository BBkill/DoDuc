import java.util.*;
public class SoUuThe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {   
            String number=in.next();
            int invalid=0;
            for (int i = 0; i < number.length(); i++) {
                if((number.charAt(i)-'0')<0||(number.charAt(i)-'0')>9)
                {
                    System.out.println("INVALID");
                    invalid=1;
                    break;
                }
            }
                if(invalid==0)
                {
                    if(Check(number)) System.out.println("YES");
                    else System.out.println("NO");
                }
            
        } 
    } 
    static boolean Check(String number)
    {
        int dem= number.length();
        int soChan=0,soLe=0;
        for(int i=0;i<dem;i++)
        {
            if(((number.charAt(i)-'0')%2==0)) soChan++;
            else soLe++;
        }
        if(((soChan>soLe)&&(dem%2==0))||((soLe>soChan)&&dem%2==1)) return true;
        return false;
    }
}
