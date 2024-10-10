package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Pastebin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://pastebin.com/");
        driver.manage().window().maximize();
//        WebElement bar= new  WebDriverWait(driver,Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"postform-text\"]")));
//        bar.sendKeys("Hello webDriver");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/form/div[5]/div[1]/div[4]/div/span/span[1]/span/span[1]"));
        js.executeScript("arguments[0].scrollIntoView(true)",element);
        //element.click();
        //WebElement xx= new WebDriverWait(driver,Duration.ofSeconds(10))
          //      .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"postform-expiration\"]")));
        //Thread.sleep(5000);
        element.click();
        Select dropdown= new Select(element);
        dropdown.selectByVisibleText("10 Minutes");
        //driver.findElement(By.xpath("//*[@id=\"postform-name\"]")).sendKeys("helloweb");
        //driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[10]/button")).click();
    }
    }




