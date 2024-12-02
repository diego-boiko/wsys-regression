package stepdefinitions;

import br.com.chsportalbr.action.*;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import util.WebDriverManager;

public class HomeSteps {

    WebDriver driver;
    Login login;
    Home home;
    Contrato contrato;

    @Then("its homePage is correctly displayed")
    public void itsHomePageIsCorrectlyDisplayed() {

        home = new Home();
        home.validateHomePageElements();

    }

    // @Given("I access the test wsys 2.0 nomination of ships page")
    // public void iAccessTheTestWsysNominationOfShipsPage() {

    //     home = new Home();
    //     login = new Login();
    //     nominationOfShips = new NominationOfShips();

    //     WebDriverManager.getDriver();

    //     login.login();
    //     home.accessTheTestWsysNominationOfShipsPage();

    //     nominationOfShips.newShip();

    // }

    @Given("I access the test wsys new contrato page")
    public void iAccessTheTestWsysNewContratoPage() {

        home = new Home();
        login = new Login();
        contrato = new Contrato();

        WebDriverManager.getDriver();

        login.login();
        home.accessContratoPage();
        contrato.accessNewContractPage();

    }

    // @Given("I access the test wsys 2.0 nomination of ships page")
    // public void iAccessTheTestWsysContratoPage() {

    // home = new Home();
    // login = new Login();

    // WebDriverManager.getDriver();

    // login.login();
    // home.accessTheTestWsysContratoPage();

    // }

}