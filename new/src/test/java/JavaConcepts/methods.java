package JavaConcepts;

import JavaConcepts.accessModifiers;
public class methods {
    int a = 5;
    void a(){ //returnType methodName(){}
        System.out.println("Void a"); //Method Body
    }

    void b(){
        System.out.println(5+7);
    }

    void c(int x){
       System.out.println(x*x);
    }

    void d(int a, float b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        methods m = new methods();
        accessModifiers AM=new accessModifiers();
        AM.e();
        methods m1 = new methods();
        System.out.println(m.hashCode());
        System.out.println(m1.hashCode());
        System.out.println(m.a); //Calling Instance Variable
        m.a(); //Calling method
        m.a();
        m.b();
        m.c(25);
        m.c(23);
        m.d(4,2.5f);
    }
}
