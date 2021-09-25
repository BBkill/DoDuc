import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=Integer.parseInt( in.nextLine());
        ArrayList<ThiSinh> ds =new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            ThiSinh ts = new ThiSinh(in.nextLine(),in.nextLine(),Double.parseDouble(in.nextLine()),Double.parseDouble(in.nextLine()),Double.parseDouble(in.nextLine()));
            ds.add(ts);
        }
        for (ThiSinh thiSinh : ds) {
            System.out.println(thiSinh);
        }
        
    }
}