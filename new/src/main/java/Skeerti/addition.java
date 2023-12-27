package Skeerti;
public class addition {
    void meth1() {
        int a1 =1,a2=2,a3=3,a4=4,a5=5,a6=6,a7=7,a8=8,a9=9,a10=10;
        System.out.println("Addition of first 10 numbers(1-10):"+(a1+a2+a3+a4+a5+a6+a7+a8+a9+a10));
    }
    int meth2(int a,int b,int c,int d,int e,int f,int g,int h,int i,int j){
        return a+b+c+d+e+f+g+h+i+j;
    }
    public static void main(String[] args){
        addition ad=new addition();
        ad.meth1();
        System.out.println("Addition of first 10 numbers(1-10):"+ad.meth2(0,1,2,3,4,5,6,7,8,9));
    }
}
