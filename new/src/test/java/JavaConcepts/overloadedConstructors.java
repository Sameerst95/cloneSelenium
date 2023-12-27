package JavaConcepts;

public class overloadedConstructors {

    overloadedConstructors(){
        System.out.println("No Params");
    }
    overloadedConstructors(int x){
        System.out.println("int Parameter");
    }
    overloadedConstructors(float a, float b){
        System.out.println("float Params");
    }

    public static void main(String[] args){
        overloadedConstructors oc = new overloadedConstructors();
        overloadedConstructors oc1 = new overloadedConstructors(1);
    }
}
