package Sowjanya;
public class sumof10nbrs {
    void addnrt(){
        int x=0;
        for(int i=1;i<=10;i++){
            x = x + i;
        }
        System.out.println("Sum of 10 numbers is "+x);
    }
    int addwrt(){
        int x=0;
        for(int i=1;i<=10;i++){
            x = x + i;
        }
        return x;
    }
    public static void main(String[] args){
          sumof10nbrs rty = new sumof10nbrs();
          rty.addnrt();
          int y = rty.addwrt();
          System.out.println("Sum of 10 numbers with return is "+y);
    }
}