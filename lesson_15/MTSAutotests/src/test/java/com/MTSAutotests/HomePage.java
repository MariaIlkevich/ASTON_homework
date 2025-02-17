package com.MTSAutotests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    // Элементы страницы
    @FindBy(xpath = "//h2[contains(text(), 'Онлайн пополнение без комиссии')]")
    private WebElement onlineTopUpBlock;

    @FindBy(linkText = "Подробнее о сервисе")
    private WebElement detailsLink;

    @FindBy(id = "service-radio-id") // Замените на реальный ID
    private WebElement serviceRadioButton;

    @FindBy(id = "phone-input-id") // Замените на реальный ID
    private WebElement phoneNumberInput;

    @FindBy(id = "continue-button-id") // Замените на реальный ID
    private WebElement continueButton;

    // Конструктор
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Методы для работы с элементами
    public boolean isOnlineTopUpBlockDisplayed() {
        return onlineTopUpBlock.isDisplayed();
    }

    public void clickDetailsLink() {
        detailsLink.click();
    }

    public void selectService() {
        serviceRadioButton.click();
    }

    public void enterPhoneNumber(String phoneNumber) {
        phoneNumberInput.sendKeys(phoneNumber);
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void navigateBack() {
        driver.navigate().back();
    }
}