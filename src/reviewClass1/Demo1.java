package reviewClass1;

import org.testng.annotations.*;

public class Demo1 {
    //Testng is annotation based tool/ framework

    // the main annotation in testng is  @Test
    // when we tag any method with this annotation, it means it is actual test method.
    @Test
    public void firstTest(){
        System.out.println("I am first test");
    }

    @Test
    public void secondTest(){
        System.out.println("I am second test");
    }
   @Test
    public void a(){
        System.out.println("I am A ");
    }
     @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I am after test");
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
