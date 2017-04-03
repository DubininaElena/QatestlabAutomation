import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
public class SeleniumDemo {
    public static void main(String[]args){

        String property = System.getProperty("user.dir")+"/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0");

        WebElement loginField = driver.findElement(By.name("email"));
        loginField.sendKeys("webinar.test@gmail.com");

        WebElement passwordField = driver.findElement(By.id("passwd"));
        passwordField.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement loginButton = driver.findElement(By.name("submitLogin"));
        loginButton.click();

        WebElement button = driver.findElement(By.className("employee_avatar_small"));
        button.click();

        WebElement logoutButton = driver.findElement(By.id("header_logout"));
        logoutButton.click();

        driver.quit();
    }
}
