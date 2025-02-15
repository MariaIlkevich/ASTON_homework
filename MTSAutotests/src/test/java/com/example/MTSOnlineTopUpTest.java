package com.example.MTSAutotests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MTSOnlineTopUpTest {

    private WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.mts.by/");
    }

    @Test
    public void testBlockName() {
        String expectedBlockName = "Онлайн пополнение без комиссии";
        WebElement onlineTopUpBlock = driver.findElement(By.xpath("//h2[contains(text(), '" + expectedBlockName + "')]"));
        Assert.assertTrue(onlineTopUpBlock.isDisplayed(), "Блок '" + expectedBlockName + "' не найден");
        System.out.println("Название блока успешно проверено.");
    }

    @Test
    public void testPaymentLogos() {
        String[] paymentSystems = {"visa", "mastercard", "belcard", "webmoney", "qiwi", "paypal"};
        for (String system : paymentSystems) {
            WebElement logo = driver.findElement(By.xpath("//img[contains(@src, '" + system + "')]"));
            Assert.assertTrue(logo.isDisplayed(), "Логотип " + system + " не найден");
            System.out.println("Логотип " + system + " успешно найден.");
        }
        System.out.println("Все логотипы платёжных систем найдены.");
    }

    @Test
    public void testDetailsLink() {
        WebElement detailsLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        Assert.assertTrue(detailsLink.isDisplayed(), "Ссылка 'Подробнее о сервисе' не найдена");
        detailsLink.click();
        Assert.assertTrue(driver.getTitle().contains("Подробнее о сервисе"), "Не удалось перейти на страницу 'Подробнее о сервисе'");
        System.out.println("Ссылка 'Подробнее о сервисе' работает корректно.");
        driver.navigate().back();
    }

    @Test
    public void testContinueButton() {
        WebElement serviceRadioButton = driver.findElement(By.id("service-radio-id")); // Замените на реальный ID
        serviceRadioButton.click();

        WebElement phoneNumberInput = driver.findElement(By.id("phone-input-id")); // Замените на реальный ID
        phoneNumberInput.sendKeys("297777777");

        WebElement continueButton = driver.findElement(By.id("continue-button-id")); // Замените на реальный ID
        continueButton.click();

        Assert.assertTrue(driver.getPageSource().contains("Успех"), "Кнопка 'Продолжить' не сработала");
        System.out.println("Кнопка 'Продолжить' успешно проверена.");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}