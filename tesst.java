import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class tesst
{
    public static void main(String[] args) throws ParseException {
        Date startTime = new SimpleDateFormat("HH:mm").parse("09:30");
        Date finishTime= new SimpleDateFormat("HH:mm").parse("11:00");
        long time = (startTime.getTime()-finishTime.getTime())/(1000);
        System.out.println(time);

        
    }




















    // static String setNgaySinh(String NgaySinh)
    // {
    //     //NgaySinh=NgaySinh+"/";
    //     int n=NgaySinh.length();
    //     String ss="",an="";
    //     for(int i=0;i<n-3;i++)
    //     {
    //         if(NgaySinh.charAt(i)!='/')
    //         {
    //             ss=ss+(NgaySinh.charAt(i)+"");
    //         }
    //         else
    //         {
    //             if(ss.length()<2) ss="0"+ss;
    //             an=an+ss+(NgaySinh.charAt(i)+"");
    //             ss="";
    //         }
    //     }
    //     for(int i=n-5;i<n;i++)
    //     {
    //         an=an+(NgaySinh.charAt(i)+"");
    //     }
    //     NgaySinh=an;
    //     return NgaySinh;
    // }
    // static String gpa(float n)
    // {
    //     DecimalFormat df= new DecimalFormat("#.00");
    //     return df.format(n);
    // }
    
}