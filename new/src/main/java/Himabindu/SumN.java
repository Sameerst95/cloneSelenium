package Himabindu;

public class SumN {
    void a(int n){
        n=(n*(n+1))/2;
        System.out.println(n);
    }
    public static void main(String[] args){
        SumN sm=new SumN();
        sm.a(50);
    }
}
