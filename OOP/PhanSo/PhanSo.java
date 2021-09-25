public class PhanSo{
    private long tuso, mauso;
    public PhanSo(long tuso, long mauso)
    {
        this.tuso=tuso;
        this.mauso=mauso;
    }
    private long uocChung()
    {
        long tu=tuso,mau=mauso;
        while(tu*mau!=0)
        {
            if(tu>mau) tu%=mau;
            else mau%=tu;
        }
        return tu+mau;
    }
    @Override
    public String toString() {
        return tuso/uocChung()+"/"+mauso/uocChung();
    }
}