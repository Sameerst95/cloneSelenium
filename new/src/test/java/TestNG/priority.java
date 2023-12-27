package TestNG;

import org.testng.annotations.Test;

public class priority {
    @Test(priority=0)
    void c(){
        System.out.println("Void c");
    }

    @Test(priority=1)
    void d(){
        System.out.println("Void d");
    }

    @Test(priority=3)
    void e(){
        System.out.println("Void e");
    }

    @Test(priority=1)
    void a(){
        System.out.println("Void a");
    }

    @Test(priority=2)
    void b(){
        System.out.println("Void b");
    }
}
