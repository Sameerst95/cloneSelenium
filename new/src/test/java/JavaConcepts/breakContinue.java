package JavaConcepts;

public class breakContinue {
    public static void main(String[] args){
        for(int i =0;i<5;i++){
            System.out.println(i);
            if(i==2)
            {
                System.out.println("Breaking.....");
                break; //exits the loop
//                System.out.println("Hi");
                //All code in the block should be written before 'break'
            }
        }
        System.out.println("==========");
        for(int i =0;i<5;i++){
            if(i==2){
                continue; //skips the iteration
            }
            System.out.println(i);
        }
    }
}
