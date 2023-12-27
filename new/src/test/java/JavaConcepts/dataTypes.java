package JavaConcepts;

public class dataTypes {
    public static void main(String[] args)
    {
        //2 Data types : Primitive & Non-Primitive
        //Non-Primitive : Class, Strings, Arrays & Interfaces.
        //Primitive: Integers, Decimals, Characters & Boolean.

        //Integers: There are 4 types.
        //byte : Size of byte is 2 power 8. Range is -128 to -1 & 0 to 127.
        //short: Size of short is 2 power 16. Range is - 32768 to -1 & 0 to 32767.
        //int : Size of int is 2 power 32.
        //long : Size of long is 2 power 64.

        //Decimals:
        //float : Size is 2 power 32.
        //double : Size is 2 power 64.

        //Boolean:
        //boolean: true or false

        //Character: Single quotes and Single Character
        //char: Size is 2 power 16.

        //<dataType> <identifierName> = <value>;
        byte b = 127;
        short sh = 128;
        int i = 3;
        long l = 2345234;

        float a = 1.5f;
        double d = 1.234;

        boolean b1 = true;
        char ch = 'a';
        char ch1 = '6';
        char ch2 = 65;

        System.out.println(b);
        System.out.println("b");
        System.out.println(a+b);
        System.out.println("a"+"b");
        System.out.println(ch1+ch2);
        System.out.println(ch1+5);
        System.out.println("a"+5);
    }
}
