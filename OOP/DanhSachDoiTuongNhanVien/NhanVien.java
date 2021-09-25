import java.util.*;
import java.text.*;
import java.text.DateFormat;
public class NhanVien{
    private String name;
    private int ID;
    private String gender;
    private String address;
    private String doB;
    private String tax;
    private String signDate;
    public NhanVien (int ID,String name, String gender, String doB, String address,String tax, String signDate) throws ParseException
    {
        this.ID=ID;
        this.name=name;
        this.gender=gender;
        this.doB=doB;
        this.address=address;
        this.tax=tax;
        this.signDate=signDate;
       
    } 
    public String Gender()
    {
        if(gender.length()==2) return "Nu";
        return "Nam";
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
    public String toString(){
        return String.format("%05d", ID) + " " + Name() +" "+Gender() + " " +sinhNgay(doB) + " " +address+" "+ tax +" " +sinhNgay(signDate);
    }
}