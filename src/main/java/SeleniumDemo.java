import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Владимир on 31.03.2017.
 */
public class SeleniumDemo {
    public static void main(String[]args){

        String property = System.getProperty("user.dir")+"/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://prestashop.qatestlab.com.ua/ru/authentication?back=my-account");

        WebElement loginField = driver.findElement(By.name("email"));
        loginField.sendKeys("ocenka17061998@yandex.ua");

        WebElement passwordField = driver.findElement(By.id("passwd"));
        passwordField.sendKeys("17061998");

        WebElement loginButton = driver.findElement(By.id("SubmitLogin"));
        loginButton.click();

        WebElement logoutButton = driver.findElement(By.className("logout"));
        logoutButton.click();

        driver.quit();
    }
}
