import java.util.*;
import java.text.*;
public class SinhVien {
    private String ID;
    private String name;
    private String lop;
    private String doB;
    private float GPA;
  


    SinhVien(int stt, String name,String lop,String doB,float GPA) 
    {
        this.ID="B20DCCN"+String.format("%03d", stt);
        this.name=name;
        this.lop=lop;
        this.doB = doB;
        this.GPA=GPA;
    }
    public String Name()
    {
        String s = "",ss="";
        s = " " + name.trim().replaceAll(" +", " ").toLowerCase();
        char[] a = s.toCharArray();
        for(int i = 1; i < a.length; i++)
        {
            if(a[i-1] == ' ')
                ss=ss+ ((a[i]+"").toUpperCase());
            else
                ss=ss+(a[i]+"");
            }
        return ss;
    }
    public String sinhNgay(String date)
    {
        int n=date.length();
        String ss="",an="";
        for(int i=0;i<n-3;i++)
        {
            if(date.charAt(i)!='/')
            {
                ss=ss+(date.charAt(i)+"");
            }
            else
            {
                if(ss.length()<2) ss="0"+ss;
                an=an+ss+(date.charAt(i)+"");
                ss="";
            }
        }
        for(int i=n-4;i<n;i++)
        {
            an=an+(date.charAt(i)+"");
        }
        date=an;
        return date;
    }
    @Override
    public String toString() {
        return ID+" "+Name()+" "+lop +" "+sinhNgay(doB) +" "+String.format("%.2f", GPA);
    }
}
