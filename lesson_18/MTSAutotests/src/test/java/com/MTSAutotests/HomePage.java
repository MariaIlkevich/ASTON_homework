package com.MTSAutotests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy(id = "service-radio-id")
    private WebElement serviceRadioButton;

    @FindBy(id = "phone-input-id")
    private WebElement phoneNumberInput;

    @FindBy(id = "continue-button-id")
    private WebElement continueButton;

    @FindBy(id = "amount-display-id")
    private WebElement amountDisplay;

    @FindBy(id = "phone-display-id")
    private WebElement phoneDisplay;

    @FindBy(id = "card-number-input-id")
    private WebElement cardNumberInput;

    @FindBy(id = "card-expiry-input-id")
    private WebElement cardExpiryInput;

    @FindBy(id = "card-cvv-input-id")
    private WebElement cardCvvInput;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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

    public String getAmountDisplayText() {
        return amountDisplay.getText();
    }

    public String getPhoneDisplayText() {
        return phoneDisplay.getText();
    }

    public String getCardNumberInputPlaceholder() {
        return cardNumberInput.getAttribute("placeholder");
    }

    public String getCardExpiryInputPlaceholder() {
        return cardExpiryInput.getAttribute("placeholder");
    }

    public String getCardCvvInputPlaceholder() {
        return cardCvvInput.getAttribute("placeholder");
    }
}
