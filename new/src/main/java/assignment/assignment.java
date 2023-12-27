package assignment;
public class assignment {
    int n=10, add, i;
    //sum of first 10 int with void which returns nothing
    void sum(){

        for(i=1; i<n; i++){
            add = add + i;
            //sum = sum +i;
            System.out.println(+add);
            //return becuase of this code was not running;
        }
    }

    public static void main(String[] args){
        assignment si = new assignment();
        si.sum();

    }
}
