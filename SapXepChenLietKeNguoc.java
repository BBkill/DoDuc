import java.util.*;
public class SapXepChenLietKeNguoc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<n;i++)
        {
            int k=a[i],j=i-1;
            while(j>=0&&a[j]>k)
            {
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=k;
            StringBuilder tmp=new StringBuilder();
            tmp.append("Buoc "+(i)+": ");
            for(int t=0;t<=i;t++)
            {
                tmp.append(Integer.toString(a[t])+" ");
            }
            list.add(tmp.toString());
        }
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.println(list.get(i));
        }

    }
}
