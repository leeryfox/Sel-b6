package ru.selenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.openqa.selenium.WebDriver;



public class first_test {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,50);
    }
    @Test
    public void test() {
        driver.get("https://www.delivery-club.ru");


    }

    @After
     public void stop(){
    driver.quit();
    driver = null;
    }
}
