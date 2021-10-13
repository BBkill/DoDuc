import java.util.ArrayList;
import java.util.Scanner;
public class BubbleSortRe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
            t-=1;
            int n=in.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=in.nextInt();
            }
            ArrayList<String> result =new ArrayList<>();
            Boolean haveSwap = false;
            for (int i = 0; i < n-1; i++)
            {
                
                haveSwap = false;
                for (int j = 0; j < n-i-1; j++)
                {
                    if (arr[j] > arr[j+1])
                    {
                        int tmp = arr[j];arr[j]=arr[j+1];arr[j+1]=tmp;
                        haveSwap = true; 
                    }
                }
                if(haveSwap == false)
                {
                    break;
                }
                String tmp="";
                for(int d=0;d<n;d++)
                {
                    tmp=tmp+String.format("% 1d", arr[d]);
                }
                result.add(tmp.trim());
            }
            for(int i=result.size()-1;i>=0;i--)
            {
                System.out.println("Buoc "+(i+1)+": "+result.get(i));
            }

        } 

        
    }
   
}
