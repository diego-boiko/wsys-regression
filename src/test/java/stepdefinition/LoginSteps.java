package stepdefinition;

import br.com.chsportalbr.action.*;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.WebDriverManager;

public class LoginSteps {

    WebDriver driver;
    Login login;
    Home home;

    @Given("I access the test wsys 2.0 login page")
    public void iAccessTheTestWsysLoginPage() {

        login = new Login();
        WebDriverManager.getDriver();

    }

    @When("the page is loaded")
    public void thePageIsLoaded() {

    }

    @When("I perform a succesful login")
    public void iPerformASuccesfulLogin() {

        login.login();

    }

    @Then("its components are correctly displayed")
    public void itsComponentsAreCorrectlyDisplayed() {

        login.validateLoginPageElements();

    }
}