package Swetha;
public class IntegerSum {
    public static void main(String args[]){
    IntegerSum Sum=new IntegerSum();
    Sum.a();
    System.out.println(Sum.b());
}
    void a()
    {
        int num=0;
        for(int i=1;i<=10;i++)
        {
            num=num+i;
        }
        System.out.println(num);
    }
    int b()
    {
        int num=0;
        for(int i=1;i<=10;i++)
        {
            num=num+i;
        }
        return num;
    }
}
