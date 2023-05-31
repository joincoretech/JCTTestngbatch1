package class3;

import org.testng.annotations.Test;

public class GroupingDemo {

    @Test (groups = "smoke")
    public void firstTest(){
        System.out.println("this is first method");
    }
    @Test(groups = "smoke")
    public void secondTest(){
        System.out.println("this is second method");
    }
    @Test(groups = "regression")
    public void thirdTest(){
        System.out.println("this is third method");
    }
    @Test (groups = "smoke")
    public void forthTest(){
        System.out.println("this is forth method");
    }
}
