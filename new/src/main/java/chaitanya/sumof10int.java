package chaitanya;
public class sumof10int {
    void addint() {
        int x = 0;
        for (int i = 1; i <= 10; i++) {
            x=x+i;
        }
        System.out.println("Sum of 10 numbers is " + x);
    }

    int addintr() {
        int x = 0;
        for (int i = 1; i <= 10; i++) {
            x=x+i;
        }
        return x;
    }

    public static void main(String[] args) {
        sumof10int z = new sumof10int();
        z.addint();
        int y = z.addintr();
        System.out.println("Sum of 10 numbers with return is " + y);
    }
}