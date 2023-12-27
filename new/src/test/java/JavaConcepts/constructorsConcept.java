package JavaConcepts;

public class constructorsConcept {
    //A Constructor is similar to a method.
    //But it's name is same as the Class Name.
    //It is only executed when an object is created. No need to call it.
    //Constructors do not have a return type.

    constructorsConcept(){
        System.out.println("Constructor");
    }

    public static void main(String[] args){
        constructorsConcept cc = new constructorsConcept();
    }
}
