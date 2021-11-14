package QuanLiBanHang1;

import java.util.Date;

public class Bill {
    private int bid;
    private Consumer consumer;
    private Goods goods;
    private int number;
    Bill(){}
    public int getBid() {
        return bid;
    }
    public void setBid(int bid) {
        this.bid = bid;
    }
    public Consumer getConsumer() {
        return consumer;
    }
    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }
    public Goods getGoods() {
        return goods;
    }
    public void setGoods(Goods goods) {
        this.goods = goods;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    private long getTotalMoney()
    {
        return (long)number*goods.getExportPrice();
    }
    @Override
    public String toString() {
        return "HD"+String.format("%03d", bid) + consumer+" "+goods+" "+number+" "+getTotalMoney();
    }
}
