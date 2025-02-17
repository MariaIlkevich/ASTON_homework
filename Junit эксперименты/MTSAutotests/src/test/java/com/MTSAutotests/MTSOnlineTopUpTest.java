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

        homePage = new HomePage(driver);
        paymentSystemsPage = new PaymentSystemsPage(driver);
    }

    @Test
    public void testEmptyFieldsPlaceholders() {
        Assert.assertEquals(homePage.getCardNumberInputPlaceholder(), "Номер карты", "Неправильный плейсхолдер для номера карты");
        Assert.assertEquals(homePage.getCardExpiryInputPlaceholder(), "ММ/ГГ", "Неправильный плейсхолдер для срока действия карты");
        Assert.assertEquals(homePage.getCardCvvInputPlaceholder(), "CVV", "Неправильный плейсхолдер для CVV");
        System.out.println("Надписи в незаполненных полях проверены.");
    }

    @Test
    public void testServicePayment() {
        homePage.selectService();

        homePage.enterPhoneNumber("297777777");

        homePage.clickContinueButton();

        Assert.assertTrue(homePage.getAmountDisplayText().contains("10.00"), "Неправильная сумма оплаты");
        Assert.assertEquals(homePage.getPhoneDisplayText(), "297777777", "Неправильный номер телефона");
        System.out.println("Сумма и номер телефона отображаются корректно.");

        Assert.assertEquals(homePage.getCardNumberInputPlaceholder(), "Номер карты", "Неправильный плейсхолдер для номера карты");
        Assert.assertEquals(homePage.getCardExpiryInputPlaceholder(), "ММ/ГГ", "Неправильный плейсхолдер для срока действия карты");
        Assert.assertEquals(homePage.getCardCvvInputPlaceholder(), "CVV", "Неправильный плейсхолдер для CVV");
        System.out.println("Надписи в незаполненных полях для реквизитов карты проверены.");
    }

    @Test
    public void testPaymentSystemIcons() {
        Assert.assertTrue(paymentSystemsPage.isVisaLogoDisplayed(), "Логотип Visa не найден");
        Assert.assertTrue(paymentSystemsPage.isMastercardLogoDisplayed(), "Логотип Mastercard не найден");
        Assert.assertTrue(paymentSystemsPage.isBelcardLogoDisplayed(), "Логотип Belcard не найден");
        Assert.assertTrue(paymentSystemsPage.isWebmoneyLogoDisplayed(), "Логотип Webmoney не найден");
        Assert.assertTrue(paymentSystemsPage.isQiwiLogoDisplayed(), "Логотип Qiwi не найден");
        Assert.assertTrue(paymentSystemsPage.isPaypalLogoDisplayed(), "Логотип Paypal не найден");
        System.out.println("Все логотипы платёжных систем найдены.");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}