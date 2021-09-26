
public class SinhVien implements Comparable<SinhVien> {
    private String ID;
    private String name;
    private String lop;
    private float firstMark;
    private float secondMark;
    private float thirdMark;
    SinhVien(String ID, String name,String lop,float firstMark,float secondMark,float thirdMark) 
    {
        this.ID= ID;
        this.name=name;
        this.lop=lop;
        this.firstMark=firstMark;
        this.secondMark=secondMark;
        this.thirdMark=thirdMark;
    }
    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getLop() {
        return lop;
    }
    public float getFirstMark() {
        return firstMark;
    }
    public float getSecondMark() {
        return secondMark;
    }
    public float getThirdMark() {
        return thirdMark;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public void setFirstMark(float firstMark) {
        this.firstMark = firstMark;
    }
    public void setSecondMark(float secondMark) {
        this.secondMark = secondMark;
    }
    public void setThirdMark(float thirdMark) {
        this.thirdMark = thirdMark;
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
    // public int STT()
    // {
    //     String ans="";
    //     int n=ID.length()-1;
    //     for(int i=n-2;i<=n;i++)
    //     {
    //         ans=ans+(ID.charAt(i)+"");
    //     }
    //     return Integer.parseInt(ans);
    // }
    @Override
    public String toString() {
        return ID.toUpperCase()+" "+Name()+lop.toUpperCase()+" "+String.format("%.1f", firstMark)+" "+String.format("%.1f", secondMark)+" "+String.format("%.1f", thirdMark);
    }
    @Override
    public int compareTo(SinhVien o) {
        if(name.compareTo(o.name)>0) return 1;
        return -1;
    }
    
}
