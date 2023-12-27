package JavaConcepts;

public class overloadedMethods {

    void a(){
        System.out.println("Void a");
    }

    void a(int x){
        System.out.println("int: "+x);
    }

    void a(float y){
        System.out.println("float: "+y);
    }

    int a(int x, int y){
        return x+y;
    }
    public static void main(String[] args){
        overloadedMethods olm = new overloadedMethods();
        olm.a();
        olm.a(2);
        olm.a(2.1f);
    }
}

/*
Method Overloading means having multiple methods with same
name but different parameters inside a single class.

Method Overloading is not dependant on return types.
 */