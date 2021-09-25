import java.text.DecimalFormat;

public class SinhVien implements Comparable<SinhVien> {
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float GPA;
    private int msv;
    public SinhVien(int msv,String hoTen, String lop, String ngaySinh, float GPA)
    {
        this.msv=msv;
        this.hoTen=hoTen;
        this.lop=lop;
        this.ngaySinh=ngaySinh;
        this.GPA=GPA;
        
    }
    private String sinhNgay()
    {
        int n=ngaySinh.length();
        String ss="",an="";
        for(int i=0;i<n-3;i++)
        {
            if(ngaySinh.charAt(i)!='/')
            {
                ss=ss+(ngaySinh.charAt(i)+"");
            }
            else
            {
                if(ss.length()<2) ss="0"+ss;
                an=an+ss+(ngaySinh.charAt(i)+"");
                ss="";
            }
        }
        for(int i=n-4;i<n;i++)
        {
            an=an+(ngaySinh.charAt(i)+"");
        }
        ngaySinh=an;
        return ngaySinh;
    }
    private String getGPA()
    {
        DecimalFormat df=new DecimalFormat("#.00");
        return df.format(GPA);
    }
    public String chuanhoaTen()
    {
        String s = "",ss="";
        s = " " + hoTen.trim().replaceAll(" +", " ").toLowerCase();
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
    @Override
    public String toString() {
        return "B20DCCN"+String.format("%03d", msv)+" "+chuanhoaTen()+" "+lop+" "+sinhNgay()+" "+getGPA();
    }
    @Override
    public int compareTo(SinhVien o) {
        if(GPA-o.GPA>0) return -1;
        return 1;
    }

}
