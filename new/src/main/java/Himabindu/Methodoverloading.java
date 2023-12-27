package Himabindu;

public class Methodoverloading {
    void a(){
        System.out.println("Method overloading");
    }
    void a(int n){
        n=(n*(n+1))/2;
        System.out.println(n);
    }
    public static void main(String[] args){
        Methodoverloading mo=new Methodoverloading();
        mo.a();
        mo.a(25);
    }
}
