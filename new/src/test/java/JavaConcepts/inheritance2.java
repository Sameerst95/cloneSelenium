package JavaConcepts;
public class inheritance2 {
    void a(){
        System.out.println("Method a from inheritance2");
    }
}

class child1 extends inheritance2{
    void b(){
        System.out.println("Method b from child1");
    }
}

class child2 extends child1{
    void c(){
        System.out.println("Method c from child2");
    }
}

class child3 extends child2{
    void d(){
        System.out.println("Method d from child3");
    }
}

class child4 extends child3{
    void e(){
        System.out.println("Method e from child4");
    }

    public static void main(String[] args){
        child4 c4 = new child4();
        c4.e();
        c4.d();
        c4.c();
        c4.b();
        c4.a();
    }
}

//This Program demonstrates Multi Level Inheritance.
/* A
   |
   B
   |
   C
 */