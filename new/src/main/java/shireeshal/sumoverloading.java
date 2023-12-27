package shireeshal;

public class sumoverloading {
    void ab(){
        int sum=0;
        for(int i=1;i<=100;i++)
            sum=sum+i;
        System.out.println(sum);
    }
    int b(){
        int sum=0;
        for(int i=1;i<=10;i++)
            sum=sum+i;
        return sum;
    }
    void a(){
        int sum=0;
        for(int i=0;i<=100;i++)
            sum=sum+i;
        System.out.println(sum);
    }
    void a(int n){
        int sum=0;
        for(int i=0;i<=n;i++)
            sum=sum+i;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumoverloading so=new sumoverloading();

                        so.ab();
                        int z = so.b();
                        System.out.println(z);

                         so.a();
                         so.a(10);
    }
}
