package class1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task1 {

    @Test
    public void firstMethod(){
        System.out.println("this is first method");
    }

    @Test
    public void secondMethod(){
        System.out.println("I am second method");
    }

    @Test
    public void thirdMethod(){
        System.out.println("I am third method");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I am after test");
    }

}
