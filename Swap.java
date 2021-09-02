public class Swap {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        a=a-b;
        b=b+a;
        a=b-a;
        System.out.println(a+" "+b);
    }
}
