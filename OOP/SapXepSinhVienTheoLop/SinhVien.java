public class SinhVien implements Comparable<SinhVien> {
    private String name, ID, classes, email;
    SinhVien(String ID, String name,String classes, String email)
    {
        this.ID=ID;
        this.name=name;
        this.classes=classes;
        this.email=email;
    }
    // private String Name()
    // {
    //     String s = "",ss="";
    //     s = " " + name.trim().replaceAll(" +", " ").toLowerCase();
    //     char[] a = s.toCharArray();
    //     for(int i = 1; i < a.length; i++)
    //     {
    //         if(a[i-1] == ' ')
    //             ss=ss+ ((a[i]+"").toUpperCase());
    //         else
    //             ss=ss+(a[i]+"");
    //         }
    //     return ss;
    // }
    // private int code()
    // {
    //     String tmp="";
    //     for(int i=ID.length()-3;i<ID.length();i++)
    //     {
    //         tmp=tmp+ (ID.charAt(i)+"");
    //     }
    //     return Integer.parseInt(tmp);
    // }
    @Override
    public String toString() {
        return ID+" "+name+ " "+ classes+" "+email;
    }
    @Override
    public int compareTo(SinhVien o) {
    
        if(classes.compareTo(o.classes)==0)
        {
            return ID.compareTo(o.ID);
        }
        return classes.compareTo(o.classes);
    }
}
