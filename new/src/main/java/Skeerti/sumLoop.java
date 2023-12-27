package Skeerti;
public class sumLoop {
    void meth1(int n) {
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum = sum + i;
        }
        System.out.println("Addition of "+ n +" numbers:"+sum);
    }
    int meth2(int f, int n){
        int sum=0;
        for (int i = f; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }
    public static void main(String[] args){
        sumLoop sl=new sumLoop();
        sl.meth1(10);
        System.out.println("Addition of numbers:"+sl.meth2(1,5));
    }

}
