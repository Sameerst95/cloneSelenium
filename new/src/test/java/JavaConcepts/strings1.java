package JavaConcepts;

public class strings1 {
    public static void main(String[] args){
        String s = "Naresh IT";
        System.out.println(s.hashCode());
        String ss = new String("Hyderabad");

       // s = "Suresh IT";
        //Strings are immutable
        System.out.println(s.hashCode());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.indexOf("I"));
        System.out.println(s.lastIndexOf("I"));
        System.out.println(s.concat("Ameerpet"));
        System.out.println(s.startsWith("n"));
        System.out.println(s.endsWith("t"));
        System.out.println(s.equals("Naresh it"));
        System.out.println(s.equalsIgnoreCase("naresh it"));
        System.out.println(s.substring(0,6));
        System.out.println(s.substring(7));
        System.out.println(s.charAt(1));
        System.out.println(s.replace("Naresh","Suresh"));
        String x = "56";
        int i = Integer.parseInt(x);
        System.out.println(i/7);
        char[] ch = s.toCharArray();
        for(char c :ch){
            System.out.print(c+"\n");
        }

        String[] sss = s.split(" ");
        for(String y :sss){
            System.out.print(y+"\t");
        }
    }
}
