public class PhanSo {
    private long tu,mau;
    PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    private long ucln(long a, long b)
    {
        while(a*b!=0)
        {
            if(a>b) a = a%b;
            else b =b%a;
        }
        return a+b;
    }

    public void rutGon()
    {
        long x =ucln(tu,mau);
        tu=tu/x;
        mau=mau/x;
    }
    public PhanSo tong(PhanSo p)
    {
        long a=tu*p.mau+ mau*p.tu;
        long b= mau*p.mau;
        return new PhanSo(a,b);
    }
    public PhanSo tich(PhanSo p){
        long a=tu*p.tu;
        long b =mau*p.mau;
        return new PhanSo(a,b);
    }
    public String toString() {
        return tu+"/"+mau;
    }
}