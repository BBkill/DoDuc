public class ComplexNumber {
    private int a,b; // a+bi
    ComplexNumber(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    ComplexNumber(){}
    public static int A1(ComplexNumber first,ComplexNumber second)
    {
        return (first.a+second.a)*first.a-(first.b+second.b)*first.b;
    }
    public static int B1(ComplexNumber first,ComplexNumber second)
    {
        return (first.a+second.a)*first.b+(first.b+second.b)*first.a;
    }
    public static int A2(ComplexNumber first,ComplexNumber second)
    {
        return (first.a+second.a)*(first.a+second.a)-(first.b+second.b)*(first.b+second.b);
    }
    public static int B2(ComplexNumber first,ComplexNumber second)
    {
        return 2*(first.a+second.a)*(first.b+second.b);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}