package JavaConcepts;

public class exceptionHandling2 {

    void a() throws Exception {
        System.out.println("throw keyword");
        throw new Exception("Custom Exception");
    }

    public static void main(String[] args) throws Exception{
        System.out.println("Hello");
//        try {
            Thread.sleep(5000);
//        }
//        catch(Exception e){
//            System.out.println("Handling Exception");
//        }
        System.out.println("World");
        exceptionHandling2 e2 = new exceptionHandling2();
        try {
            e2.a();
        }
        catch (Exception e){
            System.out.println("Catch");
        }
        System.out.println("End");
    }
}
