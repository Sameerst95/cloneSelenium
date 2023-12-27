package JavaConcepts;

public class switchCondition {
    public static void main(String[] args){
        int a=1,b=0;
        switch(a+b){
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Enter a value b/w 0 & 2");
                break;
        }
        System.out.println("Out of Switch Block");
    }
}
