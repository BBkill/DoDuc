public class Oil {
    private String idGoods;
    private long Amount;
    Oil(String idGoods,long Amount)
    {
        this.idGoods=idGoods;
        this.Amount=Amount;
    }
    private String Code()
    {
        return idGoods.charAt(0)+"";
    }
    private long pricePerLitter()
    {
        
        if(Code().equals("X")) return 128000;
        if(Code().equals("D")) return 11200;
        return 9700;
    }
    private long Tax()
    {
        if(comeFrom().equals("Trong Nuoc")) return 0;
        if(Code().equals("X")) return pricePerLitter()*Amount*3/100;
        if(Code().equals("D")) return pricePerLitter()*Amount*35/1000;
        if(Code().equals("N")) return pricePerLitter()*2*Amount/100;
        return 0;
    }
    private long total()
    {
        return pricePerLitter()*Amount+Tax();
    }
    private String comeFrom()
    {
        String address = idGoods.substring(idGoods.length()-2, idGoods.length());
        if(address.equals("BP")) return "British Petro";
        if(address.equals("ES")) return "Esso";
        if(address.equals("SH")) return "Shell";
        if(address.equals("CA")) return "Castrol";
        if(address.equals("MO")) return "Mobil";
        return "Trong Nuoc";

    }
    @Override
    public String toString() {
        return idGoods+" "+comeFrom()+" "+pricePerLitter()+" "+Tax()+" "+total();
    }
}