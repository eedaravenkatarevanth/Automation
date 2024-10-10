package testngpractice;

import org.testng.annotations.*;

public class Class1 {
    @Test(groups = "group1")
    public void method1(){
        System.out.println("in the method 1 ");
    }
    @Test
    public void method2(){
        System.out.println("in the method 2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before each method of class1");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Each Method of class1");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before the classs1");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After the classs1");
    }


}
