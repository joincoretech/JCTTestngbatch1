package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SoftAssertDemo2 {

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

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(expectedTitle, actualTitle);
        System.out.println("titles are same and test is passed "+actualTitle);

        WebElement userName=driver.findElement(By.cssSelector("input.name"));
        userName.sendKeys("batch1@gmailcom");
        WebElement password=driver.findElement(By.id("Psw"));
        password.sendKeys("batch1@123");
        WebElement signinButton=driver.findElement(By.name("submit"));
        signinButton.click();

        WebElement welcomeName=driver.findElement(By.xpath("//div[@class='user-name']/p"));
         softAssert.assertTrue(welcomeName.isDisplayed());
         System.out.println("the user name displayed in home page");

        driver.quit();
         softAssert.assertAll();


    }

}
