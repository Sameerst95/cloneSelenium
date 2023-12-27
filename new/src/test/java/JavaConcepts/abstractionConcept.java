package JavaConcepts;

abstract class abc{
    //Abstract Classes contain both Abstract & Concrete Methods

    abstract void a(); //Abstract method does not have a method body

    void b(){ //Concrete method has a method body
        System.out.println("Void b");
    }
}

public class abstractionConcept extends abc {
    //Concrete Classes contain only Concrete Methods

//    abstract void c(); //Not allowed

    void a(){
        System.out.println("Overriding abstract method a");
    }

    public static void main(String[] args){
//        abc a1 = new abc();
        //We cannot create object for an Abstract Class
        abstractionConcept ac = new abstractionConcept();
        ac.b();
    }

}
