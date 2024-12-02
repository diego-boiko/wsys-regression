package br.com.chsportalbr.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.chsportalbr.action.Home;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;
import util.WebDriverManager;

public class NominationOfShipsPage {

    Home home;
    WebDriverWait wait;
    WebElement element;
    Select dropdown;

    @FindBy(xpath = "(//button[@type='button'])[366]")
    private WebElement buttonNovoNomeacao;

    @FindBy(xpath = "(//input[@type='date'])[1]")
    private WebElement calendarETA;

    @FindBy(xpath = "(//input[@type='date'])[2]")
    private WebElement calendarETB;

    @FindBy(xpath = "(//input[@type='date'])[3]")
    private WebElement calendarETS;

    @FindBy(xpath = "//input[@id='mui-23708']")
    private WebElement inputCidadePorto;

    @FindBy(xpath = "//div[@class='select__control select__control--is-focused select__control--menu-is-open css-1pahdxg-control']//div[@class='select__placeholder css-1wa3eu0-placeholder'][normalize-space()='Terminal']")
    private WebElement listTerminal;

    @FindBy(xpath = "//div[@class='select__control select__control--is-focused select__control--menu-is-open css-1pahdxg-control']//div[@class='select__placeholder css-1wa3eu0-placeholder'][normalize-space()='Produto']")
    private WebElement listProduto;

    @FindBy(xpath = "//div[contains(@class,'css-1wa3eu0-placeholder')][normalize-space()='Selecione']")
    private WebElement listPaisDestino;

    @FindBy(xpath = "//form[@action='#']//input[@placeholder='Cidade Destino']")
    private WebElement inputCidadeDestino;

    @FindBy(xpath = "//div[@class='p-2 modal-footer']//button[2]")
    private WebElement buttonSalvarNovoNomeacao;

    @FindBy(xpath = "//button[normalize-space()='Novo']")
    private WebElement buttonNovoNavio;

    @FindBy(xpath = "//input[@id='NM_NavioForm']")
    private WebElement inputNomeNovoNavio;

    @FindBy(xpath = "//div[contains(text(),'Selecione...')]")
    private WebElement listFlag;

    @FindBy(xpath = "//input[@id='NM_Owner']")
    private WebElement inputOwner;

    @FindBy(xpath = "//input[@id='AnoConstrucao']")
    private WebElement inputAnoContrucao;

    @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']/div[5]/div[1]/button[1]")
    private WebElement buttonFecharNovoNavioPopUp;

    @FindBy(xpath = "//div[@class='p-5']//div[@class='p-2 modal-footer']//button[@type='submit'][normalize-space()='Salvar']")
    private WebElement buttonSalvar;

    public NominationOfShipsPage(WebDriver driver) {

        driver = WebDriverManager.getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    }

    public void newShip() {

        element = wait.until(ExpectedConditions.elementToBeClickable(buttonNovoNomeacao));
        assertTrue(element.isDisplayed());
        buttonNovoNomeacao.click();

        element = wait.until(ExpectedConditions.elementToBeClickable(buttonNovoNavio));
        assertTrue(element.isDisplayed());
        buttonNovoNavio.click();

        inputNomeNovoNavio.sendKeys("ShipTestAutomation");

        listFlag.click();
        dropdown = new Select(listFlag);
        dropdown.selectByIndex(15);

    }

}