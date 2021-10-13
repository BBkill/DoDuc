import java.util.ArrayList;
import java.util.Scanner;

public class SapXepDoiChoTrucTiepLietKeNguoc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        byte t = in.nextByte();
        while(t-->0)
        {
            Short n=in.nextShort();
            Short[] a=new Short[n];
            ArrayList<String> result =new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                a[i]=in.nextShort();
            }
            for (int i = 0; i < n;i++)
            {
                for (int j = i + 1; j < n;j++)
                {
                    if (a[i]>a[j])
                    {
                        Short tmp=a[i];a[i]=a[j];a[j]=tmp;
                    }
                }
                
                StringBuilder tmp=new StringBuilder();
                tmp.append("Buoc "+(i+1)+": ");
                for(int d=0;d<n;d++)
                {
                    tmp.append(Integer.toString(a[d])+" ");
                }
                result.add(tmp.toString());
            }
            for(int i=result.size()-2;i>=0;i--)
            {
                System.out.println(result.get(i));
            }
        } 
    }
}
