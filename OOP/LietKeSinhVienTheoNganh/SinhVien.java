

public class SinhVien{
    private String ma,ten,lop,mail;
    SinhVien(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }
    public String getMa() {
        String s=ma.substring(5,7);
        if(s.equals("CN")&&lop.charAt(0)!='E') return "CONG NGHE THONG TIN";
        else if (s.equals("KT")) return "KE TOAN";
        else if (s.equals("AT")&&lop.charAt(0)!='E') return "AN TOAN THONG TIN";
        else if (s.equals("VT")) return "VIEN THONG";
        else if (s.equals("DT")) return  "DIEN TU";
        return "0";
    }
    @Override
    public String toString() {
        return ma+" "+ten+" "+lop+" "+mail;
    }
}