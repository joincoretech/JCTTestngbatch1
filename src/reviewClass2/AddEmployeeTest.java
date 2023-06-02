package reviewClass2;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utils.CommonMethods;
import utils.ConfigReader;

import java.time.Duration;

public class AddEmployeeTest extends CommonMethods {

    @Test
    public void addEmployee()  {
        WebElement userName = driver.findElement(By.cssSelector("input.name"));
        userName.sendKeys("batch1@gmailcom");
        WebElement password = driver.findElement(By.id("Psw"));
        password.sendKeys("batch1@123");
        WebElement signinButton = driver.findElement(By.name("submit"));
        signinButton.click();
        WebElement employeeTab=driver.findElement(By.xpath("//span[text()='Employee']"));
        employeeTab.click();
        WebElement addEmployee= driver.findElement(By.xpath("//a[text()='Add Employee']"));
        addEmployee.click();

        WebElement empID=driver.findElement(By.cssSelector("input[name='empid']"));
        empID.sendKeys("10023");
        WebElement choseFile=driver.findElement(By.cssSelector("input[name='pfimg']"));
        choseFile.sendKeys("C:\\Users\\azizu\\IdeaProjects\\TestNgBatch1\\src\\reviewClass2\\img.png");

        WebElement genderDD=driver.findElement(By.cssSelector("select[name='gender']"));
        Select select=new Select(genderDD);
        select.selectByIndex(2);

        WebElement fName= driver.findElement(By.cssSelector("input[name='fname']"));
        fName.sendKeys("instructor");

        WebElement mName= driver.findElement(By.cssSelector("input[name='mname']"));
        mName.sendKeys("A");

        WebElement lName= driver.findElement(By.cssSelector("input[name='lname']"));
        lName.sendKeys("lastName");

        WebElement d0B= driver.findElement(By.id("Birthdate"));
        d0B.click();

        WebElement year=driver.findElement(By.xpath("(//div[@class='xdsoft_label xdsoft_year'])[1]/span"));

        WebElement  prevButton= driver.findElement(By.xpath("(//button[@class='xdsoft_prev'])[1]"));

         boolean flag=true;
         while (flag){
             prevButton.click();
           String yearText= year.getText();
           if (yearText.equals("2000")){
               flag=false;
           }
         }
        driver.findElement(By.xpath("(//div[@class='xdsoft_calendar'])[1]/table/tbody/tr/td")).click();

         WebElement mStatus=driver.findElement(By.xpath("//select[@name='marital']"));
          select=new Select(mStatus);
          select.selectByIndex(1);

        WebElement number= driver.findElement(By.xpath("//input[@name='mnumber']"));
        number.sendKeys("5713211234");


    }

}
