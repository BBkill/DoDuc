package QuanLiBanHang1;

public class Goods {
    private String gid,gname,unit;
    private long importPrice,exportPrice;
    Goods(int gid, String gname,String unit,long importPrice,long exportPrice)
    {
        this.gid = "MH"+String.format("%03d", gid);
        this.gname =gname;
        this.unit = unit;
        this.importPrice = importPrice;
        this.exportPrice=exportPrice;
    }
    public void setExportPrice(long exportPrice) {
        this.exportPrice = exportPrice;
    }
    public void setGid(String gid) {
        this.gid = gid;
    }
    public void setGname(String gname) {
        this.gname = gname;
    }
    public void setImportPrice(long importPrice) {
        this.importPrice = importPrice;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public long getExportPrice() {
        return exportPrice;
    }
    @Override
    public String toString() {
        return gname+" "+unit+" "+importPrice+" "+exportPrice+" ";
    }
}
