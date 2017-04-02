import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Владимир on 01.04.2017.
 */
public class SeleniumDemo1 {
    public static void main(String[]args){
        String property = System.getProperty("user.dir")+"/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://prestashop.qatestlab.com.ua/");

        WebElement women = driver.findElement(By.className("sf-with-ul"));
        women.click();
        driver.navigate().refresh();
        WebElement blocwomen = driver.findElement(By.className("cat_desc"));
        System.out.println(blocwomen.getText());

        WebElement feedback = driver.findElement(By.id("contact-link"));
        feedback.click();
        driver.navigate().refresh();
        WebElement blocfeedback = driver.findElement(By.className("contact-form-box"));
        System.out.println(blocfeedback.getText());

        WebElement cart = driver.findElement(By.tagName("b"));
        cart.click();
        driver.navigate().refresh();
        WebElement blokcart = driver.findElement(By.id("center_column"));
        System.out.println(blokcart.getText());
        driver.quit();
    }
}



