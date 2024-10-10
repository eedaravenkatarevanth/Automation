package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelloSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/cart.html");
        WebElement userName= driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
        userName.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        WebElement login_btn= driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        login_btn.click();
        Thread.sleep(2000);



        // After LOginnn

        WebElement addElement1= new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")));
        addElement1.click();
        Thread.sleep(3000);
        WebElement addElement2= new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")));
        addElement2.click();
Thread.sleep(3000);

        WebElement cartPage= new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"shopping_cart_container\"]/a")));
        cartPage.click();
        Thread.sleep(3000);

        //Your Cart Page

        WebElement checkout= new WebDriverWait(driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"checkout\"]")));
        checkout.click();
        Thread.sleep(2000);
        //enterDetails page

        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Revanth");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Eedara");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("500081");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
        Thread.sleep(2000);
    }
}
