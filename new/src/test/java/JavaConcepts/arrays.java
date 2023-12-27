package JavaConcepts;

public class arrays {
    public static void main(String[] args){
        //Arrays store multiple values of the same data type
        int[] a;
        a = new int[5];
        float[] b = new float[6];
        char[] c ={'a','b','c','d','e'};

        a[0] = 9;
        a[1] = 8;
        a[2] = 7;
        a[3] = 6;
        a[4] = 10;
//        a[5] =11;

//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(a[3]);
//        System.out.println(a[4]);
        for(int i =0;i<a.length;i++) {
            System.out.println(a[i]);
        }

    }
}
