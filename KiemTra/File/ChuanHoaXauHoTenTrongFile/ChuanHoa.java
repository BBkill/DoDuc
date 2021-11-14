package ChuanHoaXauHoTenTrongFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ChuanHoa {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("DATA.in"));
        ArrayList<String> nameList = new ArrayList<>();
        while (input.hasNextLine()) {
            String tmp = input.nextLine();
            if (tmp.equals("END"))
                break;
            else {
                nameList.add(chuanhoaTen(tmp));
            }
        }
        for (String name : nameList) {
            System.out.println(name);
        }
    }

    public static String chuanhoaTen(String hoTen) {
        String s = "", ss = "";
        s = " " + hoTen.trim().replaceAll(" +", " ").toLowerCase();
        char[] a = s.toCharArray();
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] == ' ')
                ss = ss + ((a[i] + "").toUpperCase());
            else
                ss = ss + (a[i] + "");
        }
        return ss;
    }
}