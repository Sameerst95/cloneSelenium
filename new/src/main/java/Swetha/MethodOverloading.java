package Swetha;
public class MethodOverloading {
    void sum(int n)
    {
        int x = 0;
        for (int i = 1; i <= n; i++)
        {
            x = x + i;
        }
        System.out.println(x);
    }
    void sum()
    {
        int num=0;
        for(int i=1;i<=10;i++)
        {
            num=num+i;
        }
        System.out.println(num);
    }
    public static void main(String args[])
    {
        MethodOverloading Num=new MethodOverloading();
        Num.sum(5);
        Num.sum();
    }
}
