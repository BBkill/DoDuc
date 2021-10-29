package TinhGio;

public class LopHocPhan {
    protected   String maGV,maMonHoc;
    protected   float soGio;
    LopHocPhan(){}

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public void setSoGio(float soGio) {
        this.soGio = soGio;
    }

    public String getMaGV() {
        return maGV;
    }
    public float getSoGio() {
        return soGio;
    }
    public String getMaMonHoc() {
        return maMonHoc;
    }

    @Override
    public String toString() {
        return " ";
    }
}
