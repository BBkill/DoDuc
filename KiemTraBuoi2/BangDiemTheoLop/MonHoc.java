package BangDiemTheoLop;



public class MonHoc {
    private String mhId, mhName;
    private int section;

    MonHoc(String mhId,String mhName,int section)
    {
        this.mhId=mhId;
        this.mhName = mhName;
        this.section = section;
    }
    public String getMhId() {
        return mhId;
    }
    public String getMhName() {
        return mhName;
    }
    public int getSection() {
        return section;
    }
    
    @Override
    public String toString() {
        return mhId+" "+mhName+" ";
    }
}
