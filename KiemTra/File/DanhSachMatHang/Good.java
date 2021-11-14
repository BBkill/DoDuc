package DanhSachMatHang;

public class Good implements Comparable<Good> {
    private String name, unit, id;
    private long importPrice,exportPrice;

    Good(int id, String name,String unit, long importPrice, long exportPrice)
    {
        this.id = "MH"+String.format("%03d", id);
        this.name = name;
        this.unit=unit;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;

    }

    private long getProfit()
    {
        return exportPrice-importPrice;
    }
    @Override
    public int compareTo(Good o) {
        return -(int)(getProfit()-o.getProfit());
    }
    @Override
    public String toString() {
        return id+" "+name+" "+unit+" "+ importPrice+" "+exportPrice+" "+getProfit();
    }
}
