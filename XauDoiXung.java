     
import java.util.*;
 
public class XauDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            char[] a = s.toCharArray();
            int dem=0;
            
            for(int i=0;i<s.length()/2;i++)
            {
                if(a[i]!=a[s.length()-1-i]) dem++;
            }            
            if(dem==1&&s.length()%2==0) System.out.println("YES");
            else if(dem==1||dem==0&&s.length()%2==1) System.out.println("YES");
            else System.out.println("NO");
            
        }
 
        sc.close();
    }
}