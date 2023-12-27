package JavaConcepts;

public class staticKeyword {
    int i = 5;
    static int si = 4;

    void a(){
        System.out.println("Void a");
    }

    static void b(){
        System.out.println("Static Void b");
    }

    static{
        System.out.println("Static Block 1");
    }

    static{
        System.out.println("Static Block 2");
    }

    public static void main(String[] args){
        staticKeyword sk = new staticKeyword();
        System.out.println(sk.i);
        System.out.println(staticKeyword.si);
        sk.a();
        staticKeyword.b();
        class12 c2 = new class12();
        System.out.println(c2.x);
        c2.c();
        System.out.println(class12.ss);
        class12.d();
    }
}

class class12{
    int x = 6;
    static int ss = 1;
    void c(){
        System.out.println("Void c");
    }

    static void d(){
        System.out.println("Static Void d");
    }
}