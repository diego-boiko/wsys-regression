package br.com.chsportalbr.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.chsportalbr.page.HomePage;
import br.com.chsportalbr.page.NominationOfShipsPage;

public class Home {

    WebDriver driver;
    HomePage homePage;
    WebDriverWait wait;

    public void HomePage() {

        homePage = new HomePage(driver);
        homePage.homePageElementsValidation();

    }

    public void validateHomePageElements() {

        homePage = new HomePage(driver);
        homePage.homePageElementsValidation();

    }

    public void accessTheTestWsysNominationOfShipsPage() {

        homePage = new HomePage(driver);
        homePage.accessTheTestWsysNominationOfShipsPage();

        NominationOfShipsPage nominationOfShipsPage = new NominationOfShipsPage(driver);
        nominationOfShipsPage.newShip();

    }

    public void accessContratoPage() {

        homePage = new HomePage(driver);
        homePage.accessContratoPage();

    }
}
