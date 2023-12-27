package JavaConcepts;

import java.util.TreeSet;

public class collections3 {
    public static void main(String[] args){
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("A");
        ts.add("e");
        ts.add("B");
        ts.add("D");
        ts.add("c");
        ts.add("D");
//        ts.add(null);
        System.out.println(ts);

        for(String x: ts){
            System.out.println(x);
        }

        System.out.println(ts.size());
        System.out.println(ts.isEmpty());
        System.out.println(ts.contains("a"));
//        ts.remove(null);
        System.out.println(ts);
    }
}
