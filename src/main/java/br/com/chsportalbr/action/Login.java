package br.com.chsportalbr.action;

import br.com.chsportalbr.page.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

    WebDriver driver;
    LoginPage loginPage;
    WebDriverWait wait;

    public void validateLoginPageElements() {

        loginPage = new LoginPage(driver);
        loginPage.loginPageElementsValidation();

    }

    public void login() {

        loginPage = new LoginPage(driver);
        loginPage.succesfulLogin();

    }
}
