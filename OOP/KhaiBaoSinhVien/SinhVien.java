import java.sql.Date;
import java.text.*;

public class SinhVien {
    private String ten, lop;
    private Date ngaysinh;
    private int GPA;
    SinhVien(String ten,String lop, String ngaysinh, int GPA) throws ParseException
    {
        this.ten=ten;
        this.lop=lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.GPA=GPA;
    }
    public String chuanhoaTen()
    {
        String ss[]=ten.trim().toLowerCase().split("\\s+");
        String ans="";
        for (String tmp : ss) {
            String s="";
            for(int i=0;i<tmp.length();i++)
            {
                if(i==0) s=s+(tmp.charAt(i)+"").toUpperCase();
                else s=s+(tmp.charAt(i)+"").toLowerCase();
            }
            ans=ans+s+" ";
        }
        return ans;
    }
    @Override
    public String toString() {
        return "B20DCCN001 "+chuanhoaTen()+" "+lop+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+" "+String.format("%0.2f", GPA);
    }
}