package login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;


public class login {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 50);
    }

    @Test
    public void test1() {
        driver.get("http://localhost/magazin/admin/login.php");

       driver.findElement(By.name("username")).sendKeys("admin");

       driver.findElement(By.name("password")).sendKeys("admin");
       driver.findElement(By.name("login")).click();

    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
   }
}