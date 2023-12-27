package JavaConcepts;

public class strings2 {
    public static void main(String[] args){
        StringBuilder sbl = new StringBuilder("Naresh IT");
        StringBuffer sbf = new StringBuffer("Hyderabad");

        System.out.println(sbf.length());
        System.out.println(sbf.lastIndexOf("I"));
        System.out.println(sbf.indexOf("I"));
        System.out.println(sbf.reverse());
    }
}
