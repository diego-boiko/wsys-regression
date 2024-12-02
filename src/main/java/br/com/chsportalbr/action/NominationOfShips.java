package br.com.chsportalbr.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.chsportalbr.page.NominationOfShipsPage;

public class NominationOfShips {

    WebDriver driver;
    WebDriverWait wait;
    NominationOfShipsPage nominationOfShipsPage;

    public void newShip() {

        nominationOfShipsPage = new NominationOfShipsPage(driver);
        nominationOfShipsPage.newShip();

    }

}
