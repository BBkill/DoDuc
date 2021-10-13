public  class Orders {
    private String name,code;
    private long pricePerProduct, number;
    Orders(String name,String code,long pricePerProduct,long number)
    {
        this.name=name;
        this.code=code;
        this.pricePerProduct=pricePerProduct;
        this.number=number;
    }
    private String orderNumber()
    {
        return code.substring(1, 4);
    }
    private long disCount()
    {
        if(code.charAt(4)=='1') return Math.round((double)pricePerProduct*(double)number*50/100d);
        return Math.round((double)pricePerProduct*(double)number*30/100d);
    }
    private long toMoney()
    {
        return pricePerProduct*number - disCount();
    }
    @Override
    public String toString() {
        return name+" "+code+" "+orderNumber()+" "+disCount()+" "+toMoney();
    }
}