package HWClass04;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {

    public static void main(String[] args) throws InterruptedException {

        //http://practice.syntaxtechs.net/javascript-alert-box-demo.php
        //click on the last alert
        //send keys and accept it
        //
        //Note: dont worry if the text u send doesnt appears up in the textbox

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");

        // habit of maximize the window
        driver.manage().window().maximize();

        WebElement promptBox=driver.findElement(By. xpath("//button[@onclick='myPromptFunction()']"));
        promptBox.click();

        Thread.sleep(3000);

        driver.switchTo().alert();
        promptBox.sendKeys("Sarah");

        Alert confirmationAlert1 = driver.switchTo().alert();
        confirmationAlert1.accept();

    }
}
