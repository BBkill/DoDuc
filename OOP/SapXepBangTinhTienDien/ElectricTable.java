public  class ElectricTable implements Comparable<ElectricTable> {
    private String typeOfConsumer;
    private long newNumber,oldNumber,order;
    ElectricTable(long order, String typeOfConsumer,long oldNumber,long newNumber)
    {
        this.order=order;
        this.typeOfConsumer=typeOfConsumer;
        this.oldNumber=oldNumber;
        this.newNumber=newNumber;
    }
    private long Ranking()
    {
        if(typeOfConsumer.equals("KD")) return 3;
        if(typeOfConsumer.equals("NN")) return 5;
        if(typeOfConsumer.equals("TT")) return 4;
        return 2;
    }
    private long BasicMoney()
    {
        return (newNumber-oldNumber)*Ranking()*550;
    }
    private long GrowMoney()
    {
        long consumtion=newNumber-oldNumber;
        if(consumtion<50) return 0;
        if(consumtion>=50&&consumtion<=100) 
        {
            if(Ranking()%2==1) return BasicMoney()*35/100 + 1;
            return BasicMoney()*35/100;
        }
        return BasicMoney();
    }
    private long total()
    {
        return BasicMoney()+GrowMoney();
    }
    @Override
    public String toString() {
        return "KH"+String.format("%02d",order)+" "+Ranking()+ " "+ BasicMoney()+" "+GrowMoney()+" " +total();
    }
    @Override
    public int compareTo(ElectricTable o) {
        return (int)(o.total()-total());
    }
}