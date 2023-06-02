package reviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

     WebElement userNameBox= driver.findElement(By.cssSelector("input[type='Email']"));
     WebElement passwordBox= driver.findElement(By.id("Psw"));
     WebElement submitButton= driver.findElement(By.name("submit"));

     WebElement employeeTab=driver.findElement(By.xpath("//span[text()='Employee']"));
     WebElement addEmployee= driver.findElement(By.xpath("//a[text()='Add Employee']"));
}
