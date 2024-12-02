package br.com.chsportalbr.page;

import java.time.Duration;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.WebDriverManager;

public class MainContractPage {

        WebDriverWait wait;
        private WebDriver driver;
        WebElement element;
        Select select;
        JavascriptExecutor js;

        @FindBy(xpath = "//i[@class='fa fa-file']")
        private WebElement novo;

        @FindBy(xpath = "(//button[@class='btn btn-primary btn-sm mr-2 mt-2 '])[2]")
        private WebElement buttonBuscar;

        @FindBy(xpath = "(//button[@title='Imprimir Contrato'])[1]")
        private WebElement buttonPrint;

        @FindBy(xpath = "(//tr[@class='MuiTableRow-root']//td[@colspan='1'])[2]")
        private WebElement textContratoNumber;

        @FindBy(xpath = "(//tr[@class='MuiTableRow-root']//td[@colspan='1'])[4]")
        private WebElement textContratoEmpresa;

        @FindBy(xpath = "(//tr[@class='MuiTableRow-root']//td[@colspan='1'])[5]")
        private WebElement textContratoFrete;

        @FindBy(xpath = "(//tr[@class='MuiTableRow-root']//td[@colspan='1'])[9]")
        private WebElement textContratoDataAbertura;

        public MainContractPage(WebDriver driver) {

                driver = WebDriverManager.getDriver();
                PageFactory.initElements(driver, this);
                wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        }

        public void clickButtonNewContract() {

                wait.until(ExpectedConditions.elementToBeClickable(novo));
                novo.click();

        }

        public void readContract() {

                driver = WebDriverManager.getDriver();

                wait.until(ExpectedConditions.visibilityOf(buttonBuscar));
                buttonBuscar.click();

                wait.until(ExpectedConditions.visibilityOfElementLocated(
                                By.xpath("(//tr[@class='MuiTableRow-root']//td[@colspan='1'])[2]")));
                String contratoNumber = textContratoNumber.getText();
                String contratoEmpresa = textContratoEmpresa.getText();
                String contratoFrete = textContratoFrete.getText();
                String contratoDataCriacao = textContratoDataAbertura.getText();

                JOptionPane contrato = new JOptionPane();
                JOptionPane.showMessageDialog(contrato, ("Contrato número " + contratoNumber + " gerado \n\n" + //
                                " Frete: " + contratoFrete + "\n" + //
                                " Empresa: " + contratoEmpresa + "\n" + //
                                " Data de Criação: " + contratoDataCriacao));

                driver.quit();

        }

}
