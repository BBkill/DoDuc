

public class Number implements Comparable<Number> {
    private int key,valure;
    Number(int key,int valure)
    {
        this.key=key;
        this.valure=valure;
    }
    //Number(){}
    
    @Override
    public String toString() {
        return String.valueOf(key)+" "+valure;
    }
    @Override
    public int compareTo(Number o) {
        return -(valure-o.valure);
    }
}