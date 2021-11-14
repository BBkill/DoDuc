package BangDiemTheoLop;

public class SinhVien {
    private String id, name, classes, mail;
    SinhVien(String id, String name,String classes, String mail )
    {
        this.id = id;
        this.name = name;
        this.classes = classes;
        this.mail = mail;
    }
    public String rightName()
    {

        name = name.toLowerCase().trim().replaceAll(" +", " ")+" ";
        String res =(name.charAt(0)+"").toUpperCase();
        for(int i=1;i<name.length()-1;i++)
        {
            if(name.charAt(i-1)==' ') res=res+(name.charAt(i)+"").toUpperCase();
            //else if(name.charAt(i)==' '&&name.charAt(i+1)==' ') continue;
            else res = res+(name.charAt(i)+"");
        }

        return res;
    }
    public String getClasses() {
        return classes;
    }
    public String getId() {
        return id;
    }
    public String getMail() {
        return mail;
    }
    @Override
    public String toString() {
        return id+" "+ rightName() + " ";
    }
}
