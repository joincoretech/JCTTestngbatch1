package reviewClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginTitleTest {

    public WebDriver driver;
    @BeforeMethod
    public void openBrowserAndLaunch(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe" );
        driver=new ChromeDriver();
        driver.get("https://dreamhiringacademy.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void validationOfTitle(){
       // System.out.println(driver.getTitle());
        String expectedTitle="Login Page - HRM";
        String actualTitle= driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Test passed the titles are same");
        }else {
            System.out.println("Test failed the titles are not same");
        }
    }

    @Test
    public void validationOfText(){
        String expectedText="Join Core Tech Human Resource Management System";
        WebElement textElement=driver.findElement(By.xpath(
                "//h1[text()='Join Core Tech Human Resource Management System']"));
        String actualText=textElement.getText();
        if (expectedText.equals(actualText)){
            System.out.println("Test case passed login page text are same");
        }else{
            System.out.println("login text test failed");
        }
    }
    @Test
    public void validLogin(){
        WebElement userName=driver.findElement(By.cssSelector("input.name"));
        userName.sendKeys("batch1@gmailcom");
        WebElement password=driver.findElement(By.id("Psw"));
        password.sendKeys("batch1@123");
        WebElement signinButton=driver.findElement(By.name("submit"));
        signinButton.click();

        WebElement welcomeName=driver.findElement(By.xpath("//div[@class='user-name']/p"));
        if (welcomeName.isDisplayed()){
            System.out.println("login test is passes the home page welcome text display "+welcomeName.getText());
        }else{
            System.out.println("Login test failed");
        }
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
