package class4;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;
import utils.ConfigReader;

import java.time.Duration;

public class ParallelTest extends CommonMethods {

    //  public WebDriver driver;

   /* @BeforeMethod(alwaysRun = true)
    public void openBrowserAndLaunch() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dreamhiringacademy.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }*/

    @Test
    public void validLogin() {
        WebElement userName = driver.findElement(By.cssSelector("input.name"));
        userName.sendKeys(ConfigReader.getPropertiesValue("username"));
        WebElement password = driver.findElement(By.id("Psw"));
        password.sendKeys(ConfigReader.getPropertiesValue("password"));
        WebElement signinButton = driver.findElement(By.name("submit"));
        signinButton.click();

    }

    @Test
    public void validateTitle() {
        String expectedTitle = "Login Page - HRM";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println("titles are same and test is passed " + actualTitle);
    }

    @Test
    public void validateHomePage() {
        WebElement userName = driver.findElement(By.cssSelector("input.name"));
        userName.sendKeys("batch1@gmailcom");
        WebElement password = driver.findElement(By.id("Psw"));
        password.sendKeys("batch1@123");
        WebElement signinButton = driver.findElement(By.name("submit"));
        signinButton.click();
        WebElement welcomeName = driver.findElement(By.xpath("//div[@class='user-name']/p"));
        Assert.assertTrue(welcomeName.isDisplayed());
        System.out.println("login test is passes the home page welcome text display " + welcomeName.getText());
    }


}

