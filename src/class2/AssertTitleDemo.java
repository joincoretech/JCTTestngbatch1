package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public  class AssertTitleDemo {
    WebDriver driver;
    @BeforeMethod
    public void loginAndLaunch(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://dreamhiringacademy.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
   @Test
    public void validateTitle(){
        String expectedTitle="Login Page - HRM";
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);

       Assert.assertEquals(expectedTitle, actualTitle);
       System.out.println("titles are same and test is passed "+actualTitle);
      /*  if (expectedTitle.equals(actualTitle)){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");

        }*/
    }

    @Test
     public void validateLoginTextDisplay(){
         WebElement login=driver.findElement(By.xpath("//h2[text()='Login In']"));
         boolean isLoginDisplayed=login.isDisplayed();// out put true/false
          System.out.println(isLoginDisplayed);
         Assert.assertTrue(isLoginDisplayed);
     }

}
