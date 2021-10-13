import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;

public class DayConCoKPhanTuTangDan {
    static int[] a = new int[20];
    static int point = 0; 
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt(),k=in.nextInt();
            ArrayList<Integer> b=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                b.add(in.nextInt());
            }
            Collections.sort(b);
            point=0;
            for(int i=1;i<=k;i++) a[i]=i;  
            while(point==0)
            {
                for(int i=1;i<=k;i++)
                {
                    System.out.print(b.get(a[i]-1)+" ");
                }
                System.out.println();
                SinhTH(n, k);
            }
        }
    }

    public static void SinhTH(int n,int k)
    {
        int i = k;
        while (i > 0 && (a[i] == n - k + i)) i--;
        if (i == 0) {
            point = 1;
            return;
        }
        else {
            a[i]++;
            for (int j = i + 1; j <= k; j++)
                a[j] = a[i] + j - i;
        }
        return;
    }
}