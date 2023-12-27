package JavaConcepts;

final class class9{
    void c(){
        System.out.println("Void c");
    }
}

class class8{
    void a(){
        System.out.println("Void a");
    }

    final void b(){
        System.out.println("Void b");
    }
}
public class finalKeyword extends class8 {
    int i = 4;
    final int fi = 6;

    void a(){
        System.out.println("child void a");
        System.out.println(fi+i);
    }

//    void b(){} //Final methods cannot be overridden
    public static void main(String[] args){
        finalKeyword fk = new finalKeyword();
        System.out.println(fk.i);
        fk.i=6;
        System.out.println(fk.i);
//        fk.fi = 7;
//        System.out.println(fk.fi);
        //Cannot update a final variable
        fk.a();
    }
}

//If a variable is declared as 'final', then it cannot be updated.
//If a method is declared as 'final', then it cannot be overridden.
//If a class is declared as 'final', then it cannot be inherited.
