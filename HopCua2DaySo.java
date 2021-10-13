import java.util.*;

public class HopCua2DaySo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),m=in.nextInt();
        Set<Integer> list =new TreeSet<>();
        for(int i=0;i<n;i++)
        {
            list.add(in.nextInt());
        }
        for(int i=0;i<m;i++)
        {
            list.add(in.nextInt());
        }
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
    
    }
}
