package br.com.chsportalbr.page;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.WebDriverManager;

public class HomePage {

    WebDriverWait wait;
    WebElement element;

    @FindBy(xpath = "//div[@class='homologacao-text']")
    private WebElement environmentDescriptionWhileLogged;

    @FindBy(xpath = "(//*[name()='svg'])[15]")
    private WebElement menuSearch;

    @FindBy(xpath = "//input[@id='InputBuscaRapida']")
    private WebElement menuSearchInput;

    @FindBy(xpath = "//button[normalize-space()='Favoritos']")
    private WebElement menuFavoritos;

    // MENU ----- NOMINATION OF SHIPS
    @FindBy(xpath = "//span[@class='font-weight-bold text-dark text-hover-primary']")
    private WebElement menuNominationOfShips;

    // MENU ----- COMMODITIES
    @FindBy(xpath = "//button[normalize-space()='Commodities']")
    private WebElement menuCommodities;

    @FindBy(xpath = "//span[normalize-space()='Precificação']")
    private WebElement menuPrecificacao;

    @FindBy(xpath = "//div[@class='submenu-item flex-1 sub-fav']//a[@class='menu-link'][normalize-space()='Contratos (GROL002)']")
    private WebElement menuContratos;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]")
    private WebElement buttonLoggout;

    public HomePage(WebDriver driver) {

        driver = WebDriverManager.getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    }

    public void homePageElementsValidation() {

        element = wait.until(ExpectedConditions.elementToBeClickable(environmentDescriptionWhileLogged));
        assertTrue(element.isDisplayed());

        WebDriverManager.closeDriver();

    }

    public void accessTheTestWsysNominationOfShipsPage() {

        element = wait.until(ExpectedConditions.elementToBeClickable(menuSearch));
        assertTrue(element.isDisplayed());
        menuSearch.click();

        menuSearchInput.sendKeys("Nomination of Ships");
        menuNominationOfShips.click();

    }

    public void accessContratoPage() {

        element = wait.until(ExpectedConditions.elementToBeClickable(menuFavoritos));
        assertTrue(element.isDisplayed());
        menuFavoritos.click();

        element = wait.until(ExpectedConditions.elementToBeClickable(menuContratos));
        assertTrue(element.isDisplayed());
        menuContratos.click();
        
    }
}
