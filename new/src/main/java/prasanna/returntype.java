package prasanna;

public class returntype {

        int a() {
            System.out.println("hi");
            return 3;

        }



        int b(int c,int d,int e,int f,int g,int h,int i,int j,int k,int l) {

            System.out.println("hello");
            return (c +d + e + f + g + h + i + j + k +l );

        }

        public static void main(String[] args) {
            returntype rt = new returntype();

            int z = rt.a();
            System.out.println(z + 3);
            int x = rt.b(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            System.out.println(x);
        }

    }

