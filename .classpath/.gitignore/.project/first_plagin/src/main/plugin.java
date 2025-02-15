package plugin;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.jupiter.api.Assertions.*;

public class test() {

    private static WebDriver driver;
    private MainPage mainPage;

    @BeforeAll
    public static void setupClass(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
    driver = new ChromeDriver();
    mainPage = new MainPage(driver);
}

    @Test1
    public void test1(){
        driver.get("https://www.mts.by/");
    }
}