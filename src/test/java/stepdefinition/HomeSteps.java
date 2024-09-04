package stepdefinition;

import br.com.chsportalbr.action.*;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;

public class HomeSteps {

    WebDriver driver;
    Login login;
    Home home;

    @Then("its homePage is correctly displayed")
    public void itsHomePageIsCorrectlyDisplayed() {

        home = new Home();
        home.validateHomePageElements();

    }

}