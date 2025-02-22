package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MTS {
    private WebDriver driver;
    private WebDriverWait wait;
    //локаторы
    //cookie
    private By cookie = By.xpath("//*[@id='cookie-agree']");


    public MTS(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void cookieAccept() {
        try {
            WebElement cookieButton = wait.until(ExpectedConditions.presenceOfElementLocated(cookie));
            String buttonName = cookieButton.getText();
            System.out.println("Имя кнопки: " + buttonName);
            cookieButton.click();
            System.out.println("нажали кнопку Cookie");
        } catch (Exception e) {
            System.out.println("Cookie не было");
        }
    }

}
