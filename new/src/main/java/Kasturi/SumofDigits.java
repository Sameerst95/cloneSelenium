package Kasturi;
public class SumofDigits {
    int sumNumbers(int n){
        int sum = 0;
        for (int i=1; i<=n; i++){
            System.out.println(i + " ");
            sum += i;
        }
        return sum;
    }
    public static void main(String[]args){
        SumofDigits sd = new SumofDigits();
        int n = 15; // You can change the value of 'n' to your desired no.
        int result = sd.sumNumbers(n);
        System.out.println("Sum of 1st " + n + " natural nos = " + result);
    }
}

