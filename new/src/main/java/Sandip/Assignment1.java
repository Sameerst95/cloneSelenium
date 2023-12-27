package Sandip;
public class Assignment1 {
    void a(){  //sum of first 10 integers by void
        int x=0;
        for (int i=1; i<=10; i++){
            x=x+i;
        }
        System.out.println("sum of 10 numbers by void method is "+ x);
    }

    int b(){ //sum of first 10 integers by return type
        int x=0;
        for (int i=1; i<=10; i++){
            x=x+i;
        }
        return x;
    }
    int c(int n) {
        int x = 0;
        for (int i = 0; i < n; i++) {
            x = x + i;
        }
        return x;
    }

public static void main(String[] args){
        Assignment1 am=new Assignment1();
        am.a(); //Assignment1
        int z=am.b();
        System.out.println("sum of 10 numbers by return type method is "+ z);
        System.out.println(am.c(20)); //Assignment2
   }
}
