package JavaConcepts;

public class forEach {
    public static void main(String[] args){
        int[] a = {9,8,7,6,0};
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println("========");
        for(int x:a){
            System.out.println(x);
        }
    }
}
