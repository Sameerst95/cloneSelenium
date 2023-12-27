package TestNG;

import org.testng.annotations.*;

public class beforeAfter {

    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("After Suite");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("After Class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("Before method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("After Method");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    void afterTest(){
        System.out.println("After Test");
    }

    @Test
    void test(){
        System.out.println("Test Annotation");
    }
}
