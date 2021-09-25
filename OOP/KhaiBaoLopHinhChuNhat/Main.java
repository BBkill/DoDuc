import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Rectange re=new Rectange(0, 0, null);
        String s[]=in.nextLine().trim().split("\\s+");
      
        re.setWidth(Float.parseFloat( s[1]));
        re.getWidth();
        re.setHeight(Float.parseFloat(s[0]));
        re.getHeight();
        re.setColor(s[2]);
        re.getColor();
        System.out.println(re);
    }
}
