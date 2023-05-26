package class1;

import org.testng.annotations.*;

public class Task2 {

    @Test
    public void firstMethod(){
        System.out.println("I am first method");
    }
    @Test
    public void secondMethod(){
        System.out.println("I am second method");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }
     @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I am after class");
    }

}
