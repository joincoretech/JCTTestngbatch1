package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class CommonMethods {
    public  WebDriver driver;
   @BeforeMethod (alwaysRun = true)
    public  void setUp(){
        ConfigReader.readProperties("src/class4/config/Config.properties");
        switch (ConfigReader.getPropertiesValue("browser")){

            case "chrome":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver2.exe");
                driver=new ChromeDriver();
                break;
            case "Firefox":
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                driver=new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");
        }
        driver.get(ConfigReader.getPropertiesValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }


    public void closBrowser(){
       driver.quit();
    }

}
