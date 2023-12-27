package JavaConcepts;

import java.util.Scanner;

public class scannerConcept {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some value");
       // String s = sc.next();
        String s = sc.nextLine();
        System.out.println(s);
//        int i = sc.nextInt();
//        System.out.println(i+5);
    }
}
