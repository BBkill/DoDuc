package DanhSachMonHoc;

public class MonHoc implements Comparable<MonHoc>{
    private String mhId, mhName;
    private int section;

    MonHoc(String mhId,String mhName,int section)
    {
        this.mhId=mhId;
        this.mhName = mhName;
        this.section = section;
    }
    @Override
    public int compareTo(MonHoc o) {
        return mhName.compareTo(o.mhName);
    }
    @Override
    public String toString() {
        return mhId+" "+mhName+" "+section;
    }
}
