package TestNG;

import org.testng.annotations.Test;

public class groups {

    @Test(groups = {"Smoke"})
    void a(){
        System.out.println("Smoke");
    }

    @Test(groups = {"Sanity"})
    void b(){
        System.out.println("Sanity");
    }

    @Test(groups = {"Smoke","Sanity"})
    void c(){
        System.out.println("Smoke + Sanity");
    }

    @Test(groups = {"Smoke","Regression"})
    void d(){
        System.out.println("Smoke + Regression");
    }
}
