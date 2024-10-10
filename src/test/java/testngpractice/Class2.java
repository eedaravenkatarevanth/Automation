package testngpractice;

import org.testng.annotations.*;
@Test(groups = "group2")
public class Class2 {

    public void method3() {
        System.out.println("in the method 3 ");
    }

    public void method4(){
        System.out.println("in the method 4");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before each method of class2");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Each Method of class2");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before the classs2");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After the classs2");
    }


}
