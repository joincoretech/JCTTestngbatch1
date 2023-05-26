package class1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");

    }
    @Test
    public void hello(){
        System.out.println("hello");
    }

    @Test
    public void method1(){
        System.out.println("I am method one");
    }
    @Test
    public void method2(){
        System.out.println("I am method two");
    }

}
