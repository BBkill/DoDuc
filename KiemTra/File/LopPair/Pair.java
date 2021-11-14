package LopPair;

public class Pair <T1 extends Number, T2 extends Number> {
    private T1 first;
    private T2 second;
    Pair(T1 first,T2 second)
    {
        this.first = first;
        this.second = second;
    }

    public boolean isPrime()
    {
        if(first.intValue() < 2 || second.intValue() < 2) return false;
        for(int i = 2;i*i<=first.intValue();i++)
        {
            if(first.intValue()%i==0) return false;
        }
        for(int i = 2;i*i<=second.intValue();i++)
        {
            if(second.intValue()%i==0) return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return first.intValue()+" "+second.intValue();
    }
}
