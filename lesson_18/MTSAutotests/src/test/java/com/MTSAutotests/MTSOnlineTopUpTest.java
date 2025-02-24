package com.MTSAutotests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.concurrent.TimeUnit;

public class MTSOnlineTopUpTest {

    private static WebDriver driver;
    private static HomePage homePage;
    private static PaymentSystemsPage paymentSystemsPage;

    @BeforeAll
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.mts.by/");

        homePage = new HomePage(driver);
        paymentSystemsPage = new PaymentSystemsPage(driver);
    }

    @Test
    public void testEmptyFieldsPlaceholders() {
        Assertions.assertEquals(homePage.getCardNumberInputPlaceholder(), "Номер карты", "Неправильный плейсхолдер для номера карты");
        Assertions.assertEquals(homePage.getCardExpiryInputPlaceholder(), "ММ/ГГ", "Неправильный плейсхолдер для срока действия карты");
        Assertions.assertEquals(homePage.getCardCvvInputPlaceholder(), "CVV", "Неправильный плейсхолдер для CVV");
        System.out.println("Надписи в незаполненных полях проверены.");
    }

    @Test
    public void testServicePayment() {
        homePage.selectService();

        homePage.enterPhoneNumber("297777777");

        homePage.clickContinueButton();

        Assertions.assertTrue(homePage.getAmountDisplayText().contains("10.00"), "Неправильная сумма оплаты");
        Assertions.assertEquals(homePage.getPhoneDisplayText(), "297777777", "Неправильный номер телефона");
        System.out.println("Сумма и номер телефона отображаются корректно.");

        Assertions.assertEquals(homePage.getCardNumberInputPlaceholder(), "Номер карты", "Неправильный плейсхолдер для номера карты");
        Assertions.assertEquals(homePage.getCardExpiryInputPlaceholder(), "ММ/ГГ", "Неправильный плейсхолдер для срока действия карты");
        Assertions.assertEquals(homePage.getCardCvvInputPlaceholder(), "CVV", "Неправильный плейсхолдер для CVV");
        System.out.println("Надписи в незаполненных полях для реквизитов карты проверены.");
    }

    @Test
    public void testPaymentSystemIcons() {
        Assertions.assertTrue(paymentSystemsPage.isVisaLogoDisplayed(), "Логотип Visa не найден");
        Assertions.assertTrue(paymentSystemsPage.isMastercardLogoDisplayed(), "Логотип Mastercard не найден");
        Assertions.assertTrue(paymentSystemsPage.isBelcardLogoDisplayed(), "Логотип Belcard не найден");
        Assertions.assertTrue(paymentSystemsPage.isWebmoneyLogoDisplayed(), "Логотип Webmoney не найден");
        Assertions.assertTrue(paymentSystemsPage.isQiwiLogoDisplayed(), "Логотип Qiwi не найден");
        Assertions.assertTrue(paymentSystemsPage.isPaypalLogoDisplayed(), "Логотип Paypal не найден");
        System.out.println("Все логотипы платёжных систем найдены.");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
