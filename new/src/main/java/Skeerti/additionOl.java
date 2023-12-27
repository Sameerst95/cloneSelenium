package Skeerti;
public class additionOl {
        void meth(int n) {
            int sum=0;
            for(int i=1;i<=n;i++) {
                sum=sum+i;
            }
            System.out.println("Addition of "+ n +" numbers:"+sum);
        }
        void meth(int f, int n) {
            int sum=0;
            for(int i=f;i<=n;i++) {
                sum=sum+i;
            }
            System.out.println("Addition of ("+f+ "-" +n+ ") numbers:"+sum);
        }

        public static void main(String[] args) {
            additionOl al=new additionOl();
            al.meth(10);
            al.meth(1,5);
        }
}
