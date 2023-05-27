package class2;


import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

    @Test
    public void AssertionMethod(){

        String expected=" JoinCoreTech";
        String actual=" JoinCoreTech";

         boolean buttonIsDisplayed= false;
        System.out.println("this is expected text "+expected);
        Assert.assertTrue(buttonIsDisplayed);

       System.out.println("looking for an other assertion");
        Assert.assertEquals(expected,actual);
        System.out.println("My test is working fine and passed");

       /* if(expected.equals(actual)){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }*/
    }
}
