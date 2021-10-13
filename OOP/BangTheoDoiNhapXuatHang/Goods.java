public class Goods{
    private String code;
    private double importedNumber;
    Goods(String code, double importedNumber)
    {
        this.code=code;
        this.importedNumber=importedNumber;
    }
    private double exportNumber()
    {
        if(code.charAt(0)=='A'){
            return Math.round(importedNumber*60/100d);
        }
        return Math.round(importedNumber*70/100d);
    }
    private double pricePerProduct()
    {
        if(code.charAt(4)=='Y') return 110000d;
        return 135000d;
    }
    private double toMoney()
    {
        return exportNumber()*pricePerProduct();
    }
    private double tax()
    {
        if(code.charAt(0)=='A'&&code.charAt(4)=='Y') return toMoney()*8/100d;
        if(code.charAt(0)=='A'&&code.charAt(4)=='N') return toMoney()*11/100d;
        if(code.charAt(0)=='B'&&code.charAt(4)=='Y') return toMoney()*17/100d;
        return toMoney()*22/100d;
    }
    @Override
    public String toString() {
        return code+" "+(long)importedNumber+" "+(long)exportNumber()+" "+(long)pricePerProduct()+" "+(long)toMoney()+" "+(long)tax();
    }
}