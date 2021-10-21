public class Pair {
    private int firstNumber,secondNumber;
    Pair(int firstNumber,int secondNumber)
    {
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
    }
    private boolean checkPrime(int number)
    {
        if(number<2) return false;
        if(number==2) return true;
        for(int i=2;i*i<=number;i++)
        {
            if(number%i==0) return false;
        }
        return true;
    }
    public boolean isPrime()
    {
        if(checkPrime(firstNumber)&&checkPrime(secondNumber)) return true;
        return false;
    }
    @Override
    public String toString() {
        return firstNumber+" "+secondNumber;
    }
}