import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =Integer.parseInt(in.nextLine());

        for(int i=0;i<n;i++)
        {
            PhanSo p1 = new PhanSo(in.nextLong(), in.nextLong());
            PhanSo p2 = new PhanSo(in.nextLong(), in.nextLong());
            PhanSo tong = p1.tong(p2);
            PhanSo tichh = tong.tich(tong);
            tichh.rutGon();
            PhanSo d = (p1.tich(p2)).tich(tichh);
            d.rutGon();
            System.out.println(tichh+" "+d);
        }
    }
}