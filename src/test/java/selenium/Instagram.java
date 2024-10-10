package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Instagram {

    public static void main(String[] args) {
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.instagram.com/");
        WebElement username= new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")));
        WebElement password= new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")));
        username.sendKeys("revanth_eedara");
        password.sendKeys("Revanth@1234");
        WebElement btn= driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
        btn.click();





        WebElement msgOption= new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mount_0_0_hj\"]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/div/div/div/div/div")));
        msgOption.click();

        WebElement chatOption= new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mount_0_0_D0\"]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div/div[5]/div/div/span/div/a/div/div/div/div[1]/svg")));
        chatOption.click();


        WebElement msgText= new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mount_0_0_D0\"]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/section/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/div[1]/p")));
        msgText.sendKeys("Hi Testing this function");

        WebElement sendButton= new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mount_0_0_D0\"]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/section/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div[3]")));

        sendButton.click();


    }
}
