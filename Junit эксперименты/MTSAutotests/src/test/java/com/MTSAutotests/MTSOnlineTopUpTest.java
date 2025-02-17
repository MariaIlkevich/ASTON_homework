package com.MTSAutotests;

import com.MTSAutotests.HomePage;
import com.MTSAutotests.PaymentSystemsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MTSOnlineTopUpTest {

    private WebDriver driver;
    private HomePage homePage;
    private PaymentSystemsPage paymentSystemsPage;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.mts.by/");

        // Инициализация Page Object
        homePage = new HomePage(driver);
        paymentSystemsPage = new PaymentSystemsPage(driver);
    }

    @Test
    public void testBlockName() {
        Assert.assertTrue(homePage.isOnlineTopUpBlockDisplayed(), "Блок 'Онлайн пополнение без комиссии' не найден");
        System.out.println("Название блока успешно проверено.");
    }

    @Test
    public void testPaymentLogos() {
        Assert.assertTrue(paymentSystemsPage.isVisaLogoDisplayed(), "Логотип Visa не найден");
        Assert.assertTrue(paymentSystemsPage.isMastercardLogoDisplayed(), "Логотип Mastercard не найден");
        Assert.assertTrue(paymentSystemsPage.isBelcardLogoDisplayed(), "Логотип Belcard не найден");
        Assert.assertTrue(paymentSystemsPage.isWebmoneyLogoDisplayed(), "Логотип Webmoney не найден");
        Assert.assertTrue(paymentSystemsPage.isQiwiLogoDisplayed(), "Логотип Qiwi не найден");
        Assert.assertTrue(paymentSystemsPage.isPaypalLogoDisplayed(), "Логотип Paypal не найден");
        System.out.println("Все логотипы платёжных систем найдены.");
    }

    @Test
    public void testDetailsLink() {
        homePage.clickDetailsLink();
        Assert.assertTrue(homePage.getPageTitle().contains("Подробнее о сервисе"), "Не удалось перейти на страницу 'Подробнее о сервисе'");
        System.out.println("Ссылка 'Подробнее о сервисе' работает корректно.");
        homePage.navigateBack();
    }

    @Test
    public void testContinueButton() {
        homePage.selectService();
        homePage.enterPhoneNumber("297777777");
        homePage.clickContinueButton();
        Assert.assertTrue(driver.getPageSource().contains("Успех"), "Кнопка 'Продолжить' не сработала");
        System.out.println("Кнопка 'Продолжить' успешно проверена.");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}