package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestClass {

    static WebDriver driver;
    static WebDriverWait wait;
    public MTS mts;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.mts.by/");
        mts = new MTS(driver, wait);
        mts.cookieAccept();

    }

    @Test
    public void test1(){
        System.out.println("ok");
    }



    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
