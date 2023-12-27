package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {

    @Parameters("sample")
    @Test
    void a(int x){
        System.out.println(x+5);
    }
}
