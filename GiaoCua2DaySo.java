
import java.util.*;
import java.util.Set;

public class GiaoCua2DaySo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),m=in.nextInt();
        Set<Integer> list1=new TreeSet<>();
        Set<Integer> list2=new TreeSet<>();
        for(int i=0;i<n;i++)
        {
            list1.add(in.nextInt());
        }
        for(int i=0;i<m;i++)
        {
            list2.add(in.nextInt());
        }
        for (Integer integer : list2) {
            if(list1.contains(integer))
                System.out.print(integer+" ");
        }
    }
}
