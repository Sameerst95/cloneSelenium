package TestNG;

import org.testng.annotations.Test;

public class parallel {
    @Test
    void c() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void c");
    }

    @Test
    void d() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void d");
    }

    @Test
    void e() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void e");
    }

    @Test
    void a() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void a");
    }

    @Test
    void b() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void b");
    }

    @Test
    void g() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void g");
    }
}
