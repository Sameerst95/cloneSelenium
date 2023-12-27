package shravani;

import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        String s;
        String rev = " ";
        char ch;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        s=sc.nextLine();
        for (int i = 0; i<s.length(); i++) {
            ch = s.charAt(i);
            rev = ch + rev;
        }
            System.out.println("reversed is:" + rev);

    }
}