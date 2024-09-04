package br.com.chsportalbr.page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.WebDriverManager;

public class LoginPage {

    WebDriverWait wait;

    @FindBy(xpath = "//h3[normalize-space()='Fazer login']")
    private WebElement txtFazerLogin;

    private String pageTitle;

    @FindBy(xpath = "//input[@placeholder='Login']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement inputSenha;

    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    private WebElement buttonEntrar;

    public LoginPage(WebDriver driver) {

        driver = WebDriverManager.getDriver();
        PageFactory.initElements(driver, this);

        this.pageTitle = driver.getTitle();

    }

    public void loginPageElementsValidation() {

        assertEquals(pageTitle, "Wsys");
        inputEmail.isDisplayed();
        inputSenha.isDisplayed();
        buttonEntrar.isDisplayed();

        WebDriverManager.closeDriver();

    }

    public void succesfulLogin() {

        inputEmail.sendKeys("dboiko");
        inputSenha.sendKeys("");
        buttonEntrar.click();

    }

}
