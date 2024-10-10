package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestGoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/login.php");
        WebElement searchBar= driver.findElement(By.id("email"));
        searchBar.sendKeys("eedaravenkatareee@gmail.com");
        WebElement passwordBar= driver.findElement(By.id("pass"));
        passwordBar.sendKeys("12345");
        WebElement searchBtn= driver.findElement(By.id("loginbutton"));
        WebElement searchBtn1= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[3]/button"));
        searchBtn1.click();

        driver.quit();

    }
}
