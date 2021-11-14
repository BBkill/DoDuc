package BangDiemTheoLop;

public class BangDiem {
    private String svId, mhId;
    private String point;
    BangDiem(String svId,String mhId, String point)
    {
        this.svId=svId;
        this.mhId= mhId;
        this.point = point;
    }
    public String getMhId() {
        return mhId;
    }
    public String getPoint() {
        return point;
    }
    public String getSvId() {
        return svId;
    }
}
