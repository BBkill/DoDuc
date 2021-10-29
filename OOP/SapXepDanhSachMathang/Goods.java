package SapXepDanhSachMathang;

public class Goods implements Comparable<Goods> {
    private String name,group;
    private float incomePrice,outcomePrice,profit;
    private int order;
    Goods(int order, String name,String group,float incomePrice,float outcomePrice)
    {
        this.order=order;
        this.name=name;
        this.group=group;
        this.incomePrice=incomePrice;
        this.outcomePrice=outcomePrice;
        this.profit=outcomePrice-incomePrice;
    }

    @Override
    public String toString() {
        return order+" "+name+" "+ group+" "+String.format("%.2f",profit);
    }

    @Override
    public int compareTo(Goods o) {
        if(profit-o.profit>0) return -1;
        return  1;
    }
}
