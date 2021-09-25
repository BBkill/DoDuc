public class PhanSo{
    private long tuso, mauso;
    PhanSo(){}
    public PhanSo(long tuso, long mauso)
    {
        this.tuso=tuso;
        this.mauso=mauso;
    }
    private long uocChung(long first,long second)
    {
        long tu=first,mau=second;
        while(tu*mau!=0)
        {
            if(tu>mau) tu%=mau;
            else mau%=tu;
        }
        return tu+mau;
    }
    private long tutongPhanSo(PhanSo fist, PhanSo second)
    {
        return  fist.tuso*second.mauso+fist.mauso*second.tuso;
    }
    private long mautongPhanSo(PhanSo fist,PhanSo second)
    {
        return fist.mauso*second.tuso;
    }
    @Override
    public String toString() {
        return tutongPhanSo(fist, second);
    }
}