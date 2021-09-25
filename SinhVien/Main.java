
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        //while(true)
        
            SinhVien sv= new SinhVien(ip.nextLine(),ip.nextLine(),ip.nextLine(),Float.parseFloat(ip.nextLine()));
            System.out.println(sv);
        
        
    }
}
