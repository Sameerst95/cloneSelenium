package Kasturi;
public class sum2 {
    int numbers(){
        int sum = 0;
        for (int i=1; i<=10; i++){
            System.out.println(i + " ");
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        sum2 sm = new sum2();
        int a = sm.numbers();
        System.out.println("Sum of 1st 10 digits =" + a);

    }
}
