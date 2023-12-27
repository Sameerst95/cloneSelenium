package JavaConcepts;

interface in{
    int x = 5; //all the variables in an interface are public static final
    void a();
//    void a(int i);
    //all the interface methods are public abstract.
}

interface in1{
    int y = 2;
}

public class interfacesConcept implements in,in1{ //Multiple Inheritance
    public void a(){
        System.out.println("Void a");
    }

    public static void main(String[] args){
        interfacesConcept ic = new interfacesConcept();
        ic.a();
//        in i = new in();
        //We cannot instantiate an Interface
//        in.x = 7;
        System.out.println(in.x);
    }
}

/*
class extends a class
interface extends an interface
class implements an interface
 */