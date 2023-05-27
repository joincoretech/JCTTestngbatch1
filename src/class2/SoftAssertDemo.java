package class2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
    @Test
    public  void softAssertionMethod(){
        String expectedText= "this is my test";
        String actualText= "THIS is my test";

        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals(actualText, expectedText);
        System.out.println("code after first assertion");

        softAssert.assertTrue(false);
        System.out.println("code after second assertion");

        softAssert.assertFalse(true);
        System.out.println("code after third assertion");

        String secondExpectedText="this is my second test";
        String secondActualText= "this is my second test";
        softAssert.assertEquals(secondActualText, secondExpectedText);
        System.out.println("this is second expected result");

        softAssert.assertAll();
    }
}
