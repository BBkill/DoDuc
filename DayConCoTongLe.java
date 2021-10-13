import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;



public class DayConCoTongLe{

    static int[] a=new int[20];
    static boolean dd=false;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();

        while(t-->0)
        {
            int  n=in.nextInt();
            dd=false;
            ArrayList<Integer> b=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                b.add(in.nextInt());
            }
            Collections.sort(b, new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    
                    return o2-o1;
                }
            });


            for(int i=0;i<15;i++) a[i]=0;
            
            while(!dd)
            {
                if(check(n,b) == true)
                {
                   
                    for(int i=0;i<n;i++)
                    {
                        if(a[i+1]==1)
                        {
                            System.out.print(b.get(i)+" ");
                        }

                    }
                    System.out.println();
                    
                }
                binary(n);
            }
          
        }
        
    }


    public static boolean check(int n,ArrayList<Integer>b)
    {
        int tmp=0;
        for(int i=1;i<=n;i++)
        {
            tmp=tmp+b.get(i-1)*a[i];
        }
        if(tmp%2==1) return true;
        return false;
    }


    public static void binary(int n)
    {
        int i=n;
        while (a[i]==1)
	    {
		    a[i]=0;
		    i--;
	    }
	    if(i==0) dd=true;
	    else a[i]=1;
    }
}