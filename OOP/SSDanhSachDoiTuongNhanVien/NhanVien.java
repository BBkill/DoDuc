import java.util.*;
import java.text.*;


public class NhanVien implements Comparable <NhanVien> {
    private String name;
    private int ID;
    private String gender;
    private String address;
    private Date doB;
    private String tax;
    private Date signDate;
    public NhanVien (int ID,String name, String gender, String doB, String address,String tax, String signDate) throws ParseException
    {
        this.ID=ID;
        this.name=name;
        this.gender=gender;
        this.doB= new SimpleDateFormat("dd/MM/yyyy").parse(doB);
        this.address=address;
        this.tax=tax;
        this.signDate= new SimpleDateFormat("dd/MM/yyyy").parse(signDate);
       
    } 
    public String Gender()
    {
        if(gender.length()==2) return "Nu";
        return "Nam";
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
        return String.format("%05d", ID) + " " + Name() +" "+Gender() + " " +new SimpleDateFormat("dd/MM/yyyy").format(doB) + " " +address+" "+ tax +" " +new SimpleDateFormat("dd/MM/yyyy").format(signDate);
    }
    public int compareTo(NhanVien a)
    {
        if(doB.compareTo(a.doB)>0) return 1;
        return -1;
    }
}