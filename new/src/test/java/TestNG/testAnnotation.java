package TestNG;

import org.testng.annotations.Test;

public class testAnnotation {

    @Test(timeOut = 4000)
    void a() throws Exception{
        Thread.sleep(5000);
        System.out.println("Done");
    }

    @Test
    void b(){
        System.out.println("Void b");
    }

    @Test(dependsOnMethods = "a")
    void c(){
        System.out.println("Void c");
    }
}
