package JavaConcepts;

public class inheritance1 {  //Parent or Super class
    int i =4;
    void a(){
        System.out.println("inheritance1");
    }
}

class class2 extends inheritance1{
    int j = 5; //Child or Sub Class

    void c(){
        super.a();
        System.out.println(super.i);
    }

    void a(){
        System.out.println("Overriding");
    }
    void b(){
        System.out.println("Class 2");
    }

    public static void main(String[] args){
        class2 c2 = new class2();
        inheritance1 i1 = new inheritance1();
        System.out.println(c2.j);
        c2.b();
//        System.out.println(i1.i);
//        i1.a();
        System.out.println(c2.i);
        c2.a();
        c2.c();
    }
}