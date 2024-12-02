package br.com.chsportalbr.action;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.chsportalbr.page.NewContractPage;
import br.com.chsportalbr.page.MainContractPage;
import br.com.chsportalbr.page.HomePage;

public class Contrato {

    WebDriver driver;
    WebDriverWait wait;
    HomePage homePage;
    MainContractPage mainContractPage;
    NewContractPage newContractPage;

    public void accessNewContractPage() {

        mainContractPage = new MainContractPage(driver);
        mainContractPage.clickButtonNewContract();

    }

    public void createNewContract(String produto, String frete) {

        newContractPage = new NewContractPage(driver);
        newContractPage.newContract(produto, frete);

    }

    public void readContract(List<String> filters) {

        mainContractPage = new MainContractPage(driver);
        mainContractPage.readContract();

    }

}
