package Sowjanya;
public class returntypes {
    void addnrt(int[] nbr){
        int x=0;
        for(int i=0;i<nbr.length;i++){
            x = x + (nbr[i]);
        }
        System.out.println("Sum of "+nbr.length+" numbers is "+x);
    }

    int addwrt(int[] nbr){
        int x=0;
        for(int i=0;i<nbr.length;i++){
            x = x + (nbr[i]);
        }
        return x;
    }
    public static void main(String[] args){
        int n = 100;
        int[] arr = new int[n];
        for(int j=0;j<n;j++){
            arr[j] = j+1;
        }
        returntypes rty = new returntypes();
        rty.addnrt(arr);
        int y = rty.addwrt(arr);
        System.out.println("Sum of "+n+" numbers with return is "+y);
    }
}
