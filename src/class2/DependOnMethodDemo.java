package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DependOnMethodDemo {

    public WebDriver driver;
    @Test
    public void openBrowserAndLaunch(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe" );
        driver=new ChromeDriver();
        driver.get("https://dreamhiringacademy.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test(dependsOnMethods = "openBrowserAndLaunch")
    public void validLogin(){
        WebElement userName=driver.findElement(By.cssSelector("input.name"));
        userName.sendKeys("batch1@gmailcom");
        WebElement password=driver.findElement(By.id("Psw"));
        password.sendKeys("batch1@123");
        WebElement signinButton=driver.findElement(By.name("submit"));
        signinButton.click();

    }
   @Test (dependsOnMethods = "validLogin")
   public void validateHomePage(){
       WebElement welcomeName=driver.findElement(By.xpath("//div[@class='user-name']/p"));
       if (welcomeName.isDisplayed()){
           System.out.println("login test is passes the home page welcome text display "+welcomeName.getText());
       }else{
           System.out.println("Login test failed");
       }
   }
}
