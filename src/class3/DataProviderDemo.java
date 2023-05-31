package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderDemo {

    @DataProvider
    public Object[][] loginData(){
        Object[] [] data= new Object[3][2];
        data[0][0]="batch1@gmailcom";
        data[0][1]="batch1@123";
        data[1][0]="admin@gmail.com";
        data[1][1]="admin#123";
        data[2][0]="batch1@gmailcom";
        data[2][1]="batch1@123";

        return data;
    }

    public WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void openBrowserAndLaunch(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe" );
        driver=new ChromeDriver();
        driver.get("https://dreamhiringacademy.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test(dataProvider = "loginData")
    public void validLogin(String userNem, String pass){
        WebElement userName=driver.findElement(By.cssSelector("input.name"));
        userName.sendKeys(userNem);
        WebElement password=driver.findElement(By.id("Psw"));
        password.sendKeys(pass);
        WebElement signinButton=driver.findElement(By.name("submit"));
        signinButton.click();

        WebElement welcomeName=driver.findElement(By.xpath("//div[@class='user-name']/p"));
        Assert.assertTrue(welcomeName.isDisplayed());
    }


    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }

}


