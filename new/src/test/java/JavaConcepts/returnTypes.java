package JavaConcepts;

public class returnTypes {

    int a(){
        System.out.println("hi");
        return 2;
    }

    int b(int x){
        System.out.println("Hello");
        return x+3;
    }

    public static void main(String[] args){
        returnTypes rt = new returnTypes();
        int z = rt.a();
        System.out.println(z+2);
        int x = rt.b(5);
        System.out.println(x+4);
    }
}
