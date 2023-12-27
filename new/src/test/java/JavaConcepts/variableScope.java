package JavaConcepts;

public class  variableScope {
    int i = 5; //Instance Variable
//    int i = 2; //Instance Variable
    static int s = 7; //static variable
    public static void main(String[] args){
        int k = 4, i = 9; //Local variable. Local to 'main' method.
        System.out.println(i); //Accessing Local Variables
        //<className> <objectName> = new <className>();
        variableScope vs = new variableScope();
        System.out.println(vs.i); //Accessing Instance Variable
        System.out.println(vs.j);
        System.out.println(variableScope.s); //Accessing Static variable
        k = 10; //Updating the variable
        System.out.println(k);
        if(k>0){
            int z = 7; //Local Variable. Local to 'if' condition
            System.out.println(z);
            System.out.println(k+4);
        }
        //System.out.println(z);
    }
    int j = 3; //Instance Variable
}

/*
Instance Variable: Declared inside a class but not inside any
method (not even main method), loop, condition etc., We can
access them only with an Object.

Local Variable: Declared inside a class but inside any
method(even main method), loop, condition etc., We do not need
an Object.

Static Variable: Declared just like an Instance Variable but with
the keyword 'static'. No need of any Object here.
 */