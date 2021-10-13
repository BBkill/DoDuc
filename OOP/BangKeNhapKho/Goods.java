public class Goods{
    private String name;
    private long number, price;
    private int id;
    Goods(String name,long number,long price)
    {
        this.name=name;
        this.number=number;
        this.price=price;
    }
    public void setId(int id) {
        this.id = id;
    }
    private long actureMoney()
    {
        return number*price;
    }
    private long tax()
    {
        if(number>10) return actureMoney()*5/100;
        if(number>=8) return actureMoney()*2/100;
        if(number>=5) return actureMoney()/100;
        return 0;
    }
    private long toMoney()
    {
        return actureMoney()-tax();
    }
    public String getNameCode()
    {
        String code[] = name.trim().split("\\s+");
        return ((code[0].charAt(0)+"")+(code[1].charAt(0)+"")).toUpperCase();
    }



    @Override
    public String toString() {
        return getNameCode()+String.format("%02d", id)+" "+name+" "+tax()+" "+toMoney();
    }

}