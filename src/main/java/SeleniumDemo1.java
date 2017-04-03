import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumDemo1 {
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

        WebElement dashboard = driver.findElement(By.className("material-icons"));
        dashboard.click();
        driver.navigate().refresh();
        WebElement titleDashboard= driver.findElement(By.tagName("h2"));
        System.out.println(titleDashboard.getText());

        WebElement commission = driver.findElement(By.linkText("Заказы"));
        commission.click();
        driver.navigate().refresh();
        WebElement titlecommission = driver.findElement(By.className("page-title"));
        System.out.println(titlecommission.getText());

        WebElement catalog = driver.findElement(By.linkText("Каталог"));
        catalog.click();
        driver.navigate().refresh();
        WebElement titleCatalog = driver.findElement(By.linkText("товары"));
        System.out.println(titleCatalog.getText());

        WebElement clients = driver.findElement(By.linkText("Клиенты"));
        clients.click();
        driver.navigate().refresh();
        WebElement titleClients = driver.findElement(By.className("page-title"));
        System.out.println(titleClients.getText());

        WebElement customerService = driver.findElement(By.linkText("Служба поддержки"));
        customerService.click();
        driver.navigate().refresh();
        WebElement titleCustomerService = driver.findElement(By.linkText("Customer Service"));
        System.out.println(titleCustomerService.getText());

        WebElement statistic = driver.findElement(By.linkText("Статистика"));
        statistic.click();
        driver.navigate().refresh();
        WebElement titlestatistic = driver.findElement(By.linkText("Статистика"));
        System.out.println(titlestatistic.getText());

        WebElement modules = driver.findElement(By.linkText("Modules"));
        modules.click();
        driver.navigate().refresh();
        //WebElement titleModules = driver.findElement(By.linkText("Выбор модуля"));
       // System.out.println(titleModules.getText());

        WebElement design = driver.findElement(By.linkText("Design"));
        design.click();
        driver.navigate().refresh();
       // WebElement titleDesign = driver.findElement(By.linkText("Шаблоны > Шаблон"));
       // System.out.println(titleDesign.getText());

        WebElement delivery = driver.findElement(By.linkText("Доставка"));
        delivery.click();
        driver.navigate().refresh();
        //WebElement titledelivery = driver.findElement(By.linkText("Перевозчики"));
        //System.out.println(titledelivery.getText());

        WebElement paymentMethod = driver.findElement(By.linkText("Способ оплаты"));
        paymentMethod.click();
        driver.navigate().refresh();
        //WebElement titlePaymentMethod = driver.findElement(By.linkText("Payment Methods"));
       // System.out.println(titlePaymentMethod.getText());

        WebElement international = driver.findElement(By.linkText("International"));
        international.click();
        driver.navigate().refresh();
        WebElement titleInternational = driver.findElement(By.linkText("Локализация"));
        System.out.println(titleInternational.getText());

        WebElement shopParameters = driver.findElement(By.linkText("Shop Parameters"));
        shopParameters.click();
        driver.navigate().refresh();
        WebElement titleShopParameters = driver.findElement(By.linkText("General"));
        System.out.println(titleShopParameters.getText());

        WebElement configuration = driver.findElement(By.linkText("Конфигурация"));
        configuration.click();
        driver.navigate().refresh();
        WebElement titleConfiguration= driver.findElement(By.linkText("Information"));
        System.out.println(titleConfiguration.getText());





        //driver.quit();
    }
}



