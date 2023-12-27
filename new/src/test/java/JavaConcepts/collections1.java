package JavaConcepts;

import java.util.ArrayList;

public class collections1 {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList();
        al.add(9);
        al.add(8);
        al.add(7);
        al.add(6);
        al.add(2);
        al.add(2);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.indexOf(2));
        System.out.println(al.lastIndexOf(2));
        System.out.println(al.isEmpty());
        System.out.println(al.contains(1));
        System.out.println(al.get(4));
    }
}
