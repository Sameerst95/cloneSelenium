package JavaConcepts;

public class exceptionHandling1 {
    public static void main(String[] args){
        System.out.println("Hello");
        int[] a = {9,8,7,6,0};
        try{
            System.out.println(0/1);
            System.out.println(a[5]);
        }
        catch(Exception e){
           System.out.println("Exception is handled");
           e.printStackTrace();
        }
        finally{
            System.out.println("finally block");
        }//finally block will execute no matter the exception is handled or not handled.

        System.out.println("World");
    }
}

//Exception is an event due to which the flow of the program is stopped during execution.

//Unchecked Exception : Logical Issues.
//Ex: ArithmeticException, ArrayIndexOutOfBoundsException

//Checked Exception : Examples: IOException, FileNotFoundException, InterruptedException etc.,
//Can be handled using 'try/catch' or using 'throws' keyword.