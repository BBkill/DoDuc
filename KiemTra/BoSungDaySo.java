import java.util.Scanner;
import java.util.*;

public class BoSungDaySo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        Set<Integer> a= new HashSet<>();
        int maxx=0;
        for(int i=0;i<n;i++)
        {
            int tmp=input.nextInt();
            a.add(tmp);
            if(i==n-1) maxx = tmp;
            
        }
        boolean check = false;
        for(int i=1;i<=maxx;i++)
        {
            if(!a.contains(i))
            {
                System.out.println(i);
                check = true;
            }
        }
        if(!check) System.out.println("Excellent!");
    }

    
}