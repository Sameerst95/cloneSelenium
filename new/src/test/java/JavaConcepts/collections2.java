package JavaConcepts;

import java.util.HashSet;

public class collections2 {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet();
        hs.add("A");
        hs.add("e");
        hs.add("B");
        hs.add("D");
        hs.add("c");
        hs.add("D");
        hs.add(null);
        System.out.println(hs);

        for(String x: hs){
            System.out.println(x);
        }

        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains("a"));
        hs.remove(null);
        System.out.println(hs);
    }
}
