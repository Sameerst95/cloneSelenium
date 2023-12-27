package JavaConcepts;

public class operators {
    public static void main(String[] args){
        int a=5, b=6, c= 7, d=8;
        float x = 1.5f;
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(b-c));
        System.out.println("Multiply: "+(c*d));
        System.out.println("Divide: "+(b/a));
        System.out.println(b/x);
        System.out.println("Modulus: "+(d%b));

        //a = a+1 or a+=1 or a++
        //a = a+2 or a+=2

        //a = a-1 or a-=1 or a--
        //a = a-2 or a-=2

        //a= a*2 or a*=2
        //a = a/2 or a/=2

//        System.out.println(a++);
//        System.out.println(a);
//        System.out.println(++a);
//        System.out.println(a+++b+c+d);
//        System.out.println(++a+b+c+d);

        //Relational Operators: >,<,>=,<=,!=,==
        // '=' - Assignment Operator
        //'==' - Equality Operator

        System.out.println(a==b);

        //Logical Operators: &&, ||
    }
}
