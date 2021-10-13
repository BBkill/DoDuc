public class StuffTable implements Comparable<StuffTable> {
    private String name, unit ;
    private double number,pricePerUnit;
    private int id;
    StuffTable(int id, String name,String unit, double pricePerUnit,double number)
    {
        this.id=id;
        this.name=name;
        this.unit=unit;
        this.pricePerUnit=pricePerUnit;
        this.number=number;
    }
    private long feeShip()
    {
        return (long)Math.round(pricePerUnit*number*5/100d);
    }
    private long toMoney()
    {
        return (long)(pricePerUnit*number)+feeShip();
    }
    private long pricePerUnitAffter()
    {
        return (long)Math.ceil((toMoney()*102)/(number*100d*100d))*100;
    }
    @Override
    public String toString() {
        return "MH"+String.format("%02d", id)+" "+name+ " "+unit+" "+feeShip()+" "+toMoney()+" "+pricePerUnitAffter();
    }
    @Override
    public int compareTo(StuffTable o) {
        if(pricePerUnitAffter()-o.pricePerUnitAffter()>0) return -1;
        return 1;
    }
}