
public class SinhVien implements Comparable<SinhVien> {
    private int ID;
    private String name;
    private String lop;
    private String doB;
    private float GPA;
    SinhVien(int ID, String name,String lop,String doB,float GPA) 
    {
        this.ID= ID;
        this.name=name;
        this.lop=lop;
        this.doB = doB;
        this.GPA=GPA;
    }
    public int getID()
    {
        return ID;
    }
    public String getName()
    {
        return name;
    }
    public String getLop()
    {
        return lop;
    }
    public String getDoB()
    {
        return doB;
    }
    public float getGPA()
    {
        return GPA;
    }
    public void setID(int ID)
    {
        this.ID=ID;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setLop(String lop) {
        this.lop=lop;
    }
    public void setDoB(String doB) {
        this.doB=doB;
    }
    public void setGPA(float GPA) {
        this.GPA=GPA;
    }

    public String Name()
    {
        String ss[]=name.trim().toLowerCase().split("\\s+");
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
        return "B20DCCN"+String.format("%03d", ID)+" "+Name()+lop +" "+sinhNgay(doB) +" "+String.format("%.2f", GPA);
    }
    public int compareTo(SinhVien a)
    {
        if(getGPA()-a.getGPA()>0) return -1;
        return 1;
    }
}
