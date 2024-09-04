package br.com.chsportalbr.page;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.WebDriverManager;

public class HomePage {

    WebDriverWait wait;

    @FindBy(xpath = "//div[@class='homologacao-text']")
    private WebElement environmentDescriptionWhileLogged;

    @FindBy(xpath = "//i[@class='fa fa-cog']")
    private WebElement settings;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    private WebElement buttonLoggout;

    public HomePage(WebDriver driver) {

        driver = WebDriverManager.getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    }

    public void homePageElementsValidation() {

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(environmentDescriptionWhileLogged));
        assertTrue(element.isDisplayed());

        WebDriverManager.closeDriver();

    }
}
