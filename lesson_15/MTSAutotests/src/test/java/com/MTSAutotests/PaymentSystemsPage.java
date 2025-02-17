package com.MTSAutotests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentSystemsPage {

    private WebDriver driver;

    // Логотипы платежных систем
    @FindBy(xpath = "//img[contains(@src, 'visa')]")
    private WebElement visaLogo;

    @FindBy(xpath = "//img[contains(@src, 'mastercard')]")
    private WebElement mastercardLogo;

    @FindBy(xpath = "//img[contains(@src, 'belcard')]")
    private WebElement belcardLogo;

    @FindBy(xpath = "//img[contains(@src, 'webmoney')]")
    private WebElement webmoneyLogo;

    @FindBy(xpath = "//img[contains(@src, 'qiwi')]")
    private WebElement qiwiLogo;

    @FindBy(xpath = "//img[contains(@src, 'paypal')]")
    private WebElement paypalLogo;

    public PaymentSystemsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isVisaLogoDisplayed() {
        return visaLogo.isDisplayed();
    }

    public boolean isMastercardLogoDisplayed() {
        return mastercardLogo.isDisplayed();
    }

    public boolean isBelcardLogoDisplayed() {
        return belcardLogo.isDisplayed();
    }

    public boolean isWebmoneyLogoDisplayed() {
        return webmoneyLogo.isDisplayed();
    }

    public boolean isQiwiLogoDisplayed() {
        return qiwiLogo.isDisplayed();
    }

    public boolean isPaypalLogoDisplayed() {
        return paypalLogo.isDisplayed();
    }
}