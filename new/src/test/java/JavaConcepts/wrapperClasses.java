package JavaConcepts;

public class wrapperClasses {
    public static void main(String[] args){
        int i = 4;
        Integer x = 5;
        float j = 2.3f;
        Float y = 3.4f;

        Integer z = Integer.valueOf(i);//Autoboxing
        int a = x.intValue(); //Unboxing

        /*
        int - Integer
        float - Float
        short - Short
        byte - Byte
        long - Long
        char - Character
        double - Double
        boolean - Boolean
         */
    }
}
