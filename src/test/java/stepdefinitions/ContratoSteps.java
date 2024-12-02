package stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import br.com.chsportalbr.action.Contrato;
import br.com.chsportalbr.action.Home;
import br.com.chsportalbr.action.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ContratoSteps {

    WebDriver driver;
    Login login;
    Home home;
    Contrato contrato;

    @Given("I fill produto {string} frete {string} other mandatory fields and save")
    public void iFillProdutoFreteOtherMandatoryFieldsAndSave(String produto, String frete) {

        contrato = new Contrato();
        contrato.createNewContract(produto, frete);

    }

    @Then("the contract is succesfuly generated")
    public void theContractIsSuccesfulyGenerated() {

        List<String> filters = new ArrayList<>();
        filters = null;

        contrato = new Contrato();
        contrato.readContract(filters);

    }

}