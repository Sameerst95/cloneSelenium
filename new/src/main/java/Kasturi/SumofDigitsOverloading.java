package Kasturi;
public class SumofDigitsOverloading {

        int sumNumbers(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println(); // Add a new line after printing the numbers
            return sum;
        }

        // Overloaded method to handle the case where 'start' is provided
        int sumNumbers(int start, int end) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        }


    public static void main(String[] args) {
            SumofDigitsOverloading sdo = new SumofDigitsOverloading();

            int n1 = 15;
            int result1 = sdo.sumNumbers(n1);
            System.out.println("Sum of 1st " + n1 + " numbers = " + result1);

            int start = 10;
            int end = 19;
            int result2 = sdo.sumNumbers(start,end);
            System.out.println("Sum of numbers from " + start + " to " + end + " = " + result2);

    }
}

