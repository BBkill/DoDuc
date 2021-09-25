class ThiSinh{
    private String ma,ten,tongdiem,diemut;
    private double diem1,diem2,diem3,diemcong;
    public ThiSinh(String ma, String ten, double diem1, double diem2, double diem3) {
        this.ma = ma;
        this.ten = ten;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.diemut=diemUT();
        this.tongdiem=tongDiem();
        this.diemcong=diemCong();

    }
    private double diemCong()
    {
        return diem1*2+diem2+diem3+Float.parseFloat(diemut);
    }
    private String  diemUT()
    {
        if(ma.charAt(2)=='1') return "0.5";
        else if (ma.charAt(2)=='2') return "1";
        return "2.5";
    }
    private String tongDiem()
    {
        StringBuilder kq =new StringBuilder(String.valueOf(diem1*2+diem2+diem3));
        int i= kq.indexOf(".");
        if(kq.charAt(i+1)=='0') kq.delete(i,i+2);
        return kq.toString();
    }
    private String trangThai()
    {
        if(diemcong<24) return "TRUOT";
        else return "TRUNG TUYEN";
    }
    @Override
    public String toString() {
        return ma+" "+ten+" "+diemut+" "+tongdiem+" "+trangThai();
    }
}