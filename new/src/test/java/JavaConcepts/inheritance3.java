package JavaConcepts;
public class inheritance3 {
    void a(){
        System.out.println("Method a from inheritance3");
    }
}

class child5 extends inheritance3{
    void b(){
        System.out.println("Method b from inheritance3");
    }
}

class child6 extends inheritance3{
    void c(){
        System.out.println("Method c from inheritance3");
    }

    public static void main(String[] args){
        child6 c6 = new child6();
        c6.c();
        c6.a();
//        c6.b(); //child object cannot access sibling methods
        child5 c5 = new child5();
        c5.b();
    }
}

//This program demonstrates Hierarchical Inheritance.
/*
    A
  / | \
  B C  D

 */