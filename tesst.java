import java.text.DecimalFormat;
import java.util.Scanner;
public class tesst
{
    public static void main(String[] args) {
        String number = "9a";

        try {
            int result = Integer.parseInt(number);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.err.println("Không thể chuyển: " + number + " thành kiểu int");
        }

        
    }
    static String setNgaySinh(String NgaySinh)
    {
        //NgaySinh=NgaySinh+"/";
        int n=NgaySinh.length();
        String ss="",an="";
        for(int i=0;i<n-3;i++)
        {
            if(NgaySinh.charAt(i)!='/')
            {
                ss=ss+(NgaySinh.charAt(i)+"");
            }
            else
            {
                if(ss.length()<2) ss="0"+ss;
                an=an+ss+(NgaySinh.charAt(i)+"");
                ss="";
            }
        }
        for(int i=n-5;i<n;i++)
        {
            an=an+(NgaySinh.charAt(i)+"");
        }
        NgaySinh=an;
        return NgaySinh;
    }
    static String gpa(float n)
    {
        DecimalFormat df= new DecimalFormat("#.00");
        return df.format(n);
    }
    
}