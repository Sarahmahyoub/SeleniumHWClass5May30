package HWClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {

    public static void main(String[] args) {
        //HW2:
        //goto https://chercher.tech/practice/frames
        //click on check box
        //then select bay cat from drop down
        //then enter text in text box
        //CherCherTech
        //Frames Example for practice
        //Frames Example for practice

        WebDriver driver=new ChromeDriver();

        driver.get("https://chercher.tech/practice/frames");

        // habit of maximize the window
        driver.manage().window().maximize();

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");

        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");

        WebElement animal = driver.findElement(By.xpath("//select[@id='animals']"));

        Select sel=new Select(animal);
        sel.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.xpath("/html/body/input"));
        text.sendKeys("I am cute");















    }
}
