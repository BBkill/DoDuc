
public class SinhVien implements Comparable <SinhVien> {
    private int ma;
    private String ten, xeploai;
    private double tb;
    private double [] bangDiem = new double [10];

    public SinhVien() {}
    SinhVien(int ma, String ten, String bangDiem[]) {
        this.ma = ma;
        this.ten = ten;
        for (int i = 0; i < 10; i++) {
            this.bangDiem[i] = Double.parseDouble(bangDiem[i]);
        }
        this.tb = diemTrungBinh();
        this.xeploai = xepLoai();
    }

    private double diemTrungBinh() {
        double diem = 0;
        diem = diem + bangDiem[0] *2 + bangDiem[1] *2;
        for (int i = 2; i < 10; i++) {
            diem += bangDiem[i];
        }
        diem = diem /12;
        diem = Math.round(diem*10.0)/10.0;
        return diem;
    }

    private String xepLoai() {
        if(tb >= 9.0) return "XUAT SAC";
        else if(tb >= 8.0) return "GIOI";
        else if(tb >= 7.0) return "KHA";
        else if(tb >= 5.0) return "TB";
        else return "YEU";
    }

    @Override
    public String toString() {
        return "HS"+String.format("%02d", ma) + " " + ten + " " + String.format("%.1f", tb) + " " + xeploai;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.tb < o.tb) return 1;
        if(this.tb > o.tb) return -1;
        else return ma-o.ma;
    }

    
    
}