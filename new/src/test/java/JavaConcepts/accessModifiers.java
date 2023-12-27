package JavaConcepts;

class class7{

    private void a(){
        System.out.println("Void a");
    }
}

public class accessModifiers {
    private void b(){
        System.out.println("Void b");
    }

    public void e(){
        System.out.println("Void e");
    }
    public static void main(String[] args){
        class7 c7 = new class7();
        accessModifiers am = new accessModifiers();
//        c7.a(); //Cannot access Private Properties outside class.
        am.b();
    }
}

//Java has 4 types of Access Modifiers 'private', 'default', 'protected' & 'public'. They can be used for Methods, Variables & Constructors.

//Access Modifier name |	within class   |   within package | outside package but subclass only | outside package
//    private	                    Y	              N	                      N	                           N
//    default	                    Y	              Y	                      N	                           N
//    protected	                    Y	              Y	                      Y	                           N
//    public	                    Y	              Y	                      Y	                           Y

