package Swetha;
public class SumIntegersN {
    void sum(int n)
    {
        int x=0;
        for(int i=1;i<=n;i++)
        {
            x=x+i;
        }
        System.out.println(x);
    }
    int SumN(int n)
    {
        int x=0;
        for(int i=1;i<=n;i++)
        {
            x=x+i;
        }
        return x;
    }
    public static void main(String args[])
    {
        SumIntegersN N=new SumIntegersN();
        N.sum(5);
        System.out.println(N.SumN(10));

    }
}
