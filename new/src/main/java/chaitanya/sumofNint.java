package chaitanya;
public class sumofNint {
    void addint(int n) {
        int x = 0;
        for (int i = 1; i <= n; i++) {
            x=x+i;
        }
        System.out.println("Sum of the first " + n + " integers is " + x);
    }

    int addintr(int n) {
        int x = 0;
        for (int i = 1; i <= n; i++) {
            x=x+i;
        }
        return x;
    }

    public static void main(String[] args) {
        sumofNint z = new sumofNint();
        int n = 20;
        z.addint(n);
        int y = z.addintr(n);
        System.out.println("Sum of the first " + n + " integers with return is " + y);
    }
}