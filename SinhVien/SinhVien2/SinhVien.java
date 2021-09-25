

public class SinhVien {
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
    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setMsv(int msv) {
        this.msv = msv;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getHoTen() {
        return hoTen;
    }
    public String getLop() {
        return lop;
    }
    public int getMsv() {
        return msv;
    }
    public String getNgaySinh() {
        return ngaySinh;
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
        return "B20DCCN"+String.format("%03d", msv)+" "+chuanhoaTen()+" "+lop+" "+sinhNgay()+" "+String.format("%.2f", GPA);
    }

}
