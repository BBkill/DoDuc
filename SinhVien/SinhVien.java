import java.text.DecimalFormat;

public class SinhVien {
    private String HoTenSv;
    private String LopSV;
    private String NgaySinh;
    private float GPA;
    private String msv;
    public SinhVien(String HoTenSv, String LopSV, String NgaySinh, float GPA)
    {
        this.HoTenSv=HoTenSv;
        this.LopSV=LopSV;
        this.NgaySinh=NgaySinh;
        this.GPA=GPA;
        msv="B20DCCN001";
    }
    private String sinhNgay()
    {
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
        for(int i=n-4;i<n;i++)
        {
            an=an+(NgaySinh.charAt(i)+"");
        }
        NgaySinh=an;
        return NgaySinh;
    }
    private String getGPA()
    {
        DecimalFormat df=new DecimalFormat("#.00");
        return df.format(GPA);
    }
   
    @Override
    public String toString() {
        return msv+" "+HoTenSv+" "+LopSV+" "+sinhNgay()+" "+getGPA();
    }

}
