package Sowjanya;
public class sumoverloading {
    void addnbrs(int[] nbr){
        int x=0;
        for(int i=0;i<nbr.length;i++){
            x = x + (nbr[i]);
        }
        System.out.println("Sum of "+nbr.length+" numbers is "+x);
    }

    int addnbrs(int[] nbr,int len){
        int x=0;
        for(int i=0;i<len;i++){
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
        sumoverloading so = new sumoverloading();
        so.addnbrs(arr);
        int y = so.addnbrs(arr,arr.length);
        System.out.println("Sum of "+n+" numbers with return is "+y);
    }
}