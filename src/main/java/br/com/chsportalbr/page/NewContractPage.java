package br.com.chsportalbr.page;

import java.time.Duration;

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

public class NewContractPage {

        WebDriverWait wait;
        private WebDriver driver;
        WebElement element;
        Select select;
        JavascriptExecutor js;

        @FindBy(xpath = "//i[@class='fa fa-file']")
        private WebElement novo;

        @FindBy(xpath = "//div[@class='card-toolbar']//button[@type='submit'][normalize-space()='Salvar']")
        private WebElement salvar;

        @FindBy(name = "TP_Movimento")
        private WebElement selectOperacao;

        @FindBy(xpath = "//div[@class='select__placeholder css-1wa3eu0-placeholder'][normalize-space()='Produto']")
        private WebElement selectProduto;

        @FindBy(xpath = "//div[contains(text(),'Finalidade')]")
        private WebElement selectFinalidade;

        @FindBy(id = "react-select-3-option-0")
        private WebElement selectFinalidadeOptionExportacao;

        @FindBy(id = "react-select-3-option-1")
        private WebElement selectFinalidadeOptionOffshore;

        @FindBy(xpath = "//div[contains(text(),'Tipo Contrato')]")
        private WebElement selectTipoContrato;

        @FindBy(id = "react-select-4-option-0")
        private WebElement selectTipoContratoOptionFixoFuturo;

        @FindBy(xpath = "(//div[contains(text(),'Moeda')])[1]")
        private WebElement selectMoeda;

        @FindBy(id = "react-select-5-option-0")
        private WebElement selectMoedaOptionBRL;

        @FindBy(xpath = "//div[contains(text(),'Produto Precificação')]")
        private WebElement selectProdutoPrecificacao;

        @FindBy(xpath = "//div[contains(text(),'Componente Mercado')]")
        private WebElement selectComponenteMercado;

        @FindBy(id = "react-select-7-option-0")
        private WebElement selectComponenteMercadoOptionSojaFixoBRL;

        @FindBy(xpath = "//div[contains(text(),'Empresa')]")
        private WebElement selectEmpresa;

        @FindBy(xpath = "//div[@class='select__menu-list css-11unzgr']")
        private WebElement selectEmpresaOptionDIV;

        @FindBy(id = "react-select-8-option-5")
        private WebElement selectEmpresaOptionSorriso;

        @FindBy(xpath = "//div[contains(text(),'Safra')]")
        private WebElement selectSafra;

        @FindBy(xpath = "//div[@class='select__menu-list css-11unzgr']")
        private WebElement selectSafraOptionDIV;

        @FindBy(id = "react-select-9-option-3")
        private WebElement selectSafraOption2425;

        @FindBy(xpath = "//input[@name='DT_InicioEntrega']")
        private WebElement inputDataInicio;

        @FindBy(xpath = "//input[@name='DT_FinalEntrega']")
        private WebElement inputDataFinal;

        @FindBy(xpath = "//input[@id='QTD_Contrato']")
        private WebElement inputQuantidadeContrato;

        @FindBy(xpath = "//select[@name='TP_Frete']")
        private WebElement selectTipoFrete;

        @FindBy(xpath = "//div[@class='col-lg-2']//input[@placeholder='Cidade Origem']")
        private WebElement inputCidadeOrigem;

        @FindBy(xpath = "(//div[@class='col-lg-2'])[10]")
        private WebElement inputLocalED;

        @FindBy(id = "react-select-10-option-1")
        private WebElement selectLocalEDRioVerde;

        @FindBy(xpath = "(//div[@class='select__indicator select__dropdown-indicator css-tlfecz-indicatorContainer'])[9]")
        private WebElement inputCidadeDestino;

        @FindBy(id = "react-select-11-input")
        private WebElement inputCidadeDestinoText;

        @FindBy(xpath = "//div[@class='select__menu-list select__menu-list--is-multi css-11unzgr']")
        private WebElement selectCidadeDestino;

        @FindBy(id = "react-select-11-option-5360")
        private WebElement selectCidadeDestinoRioVerde;

        @FindBy(xpath = "//input[@id='KMAdd_Asfalto']")
        private WebElement inputKMAddAsfalto;

        @FindBy(xpath = "//input[@id='KMAdd_Chao']")
        private WebElement inputKMAddChao;

        @FindBy(xpath = "//div[@id='kt_content']//div[4]//div[6]")
        private WebElement selectContratoArmazem;

        @FindBy(xpath = "//select[@name='TP_PGTO']")
        private WebElement inputTipoPagamento;

        @FindBy(xpath = "//input[@id='VL_Proposto']")
        private WebElement inputValorProposto;

        @FindBy(xpath = "//button[@id='btnFormLoteLogisticaContrato']")
        private WebElement buttonBuscarLote;

        @FindBy(id = "btnCalculaCorredorEntregaPrecosFixos")
        private WebElement buttonCalcular;

        @FindBy(xpath = "//div[@class='mt-10']//div[@class='jss11 table-responsive']")
        private WebElement listLotesCalculados;

        @FindBy(xpath = "(//button[@class='btn btn-icon btn-icon-primary'])[1]")
        private WebElement buttonAlocar;

        @FindBy(xpath = "//button[@class='btn btn-primary btn-sm btn-elevate mr-1']")
        private WebElement buttonSalvar;

        @FindBy(xpath = "//input[@placeholder='Cliente/Fornecedor']")
        private WebElement inputClienteFornecedor;

        @FindBy(xpath = "(//ul[@class='MuiAutocomplete-listbox'])[1]//li[@class='MuiAutocomplete-option'][1]")
        private WebElement selectClienteFornecedor;

        @FindBy(id = "//div[contains(text(),'Agência/Conta')]")
        private WebElement selectAgenciaConta;

        @FindBy(xpath = "(//div[@class=' css-tlfecz-indicatorContainer'])[2]")
        private WebElement selectNegociador;

        @FindBy(id = "react-select-14-option-2")
        private WebElement selectNegociadorIndex;

        @FindBy(xpath = "(//div[@class='select__indicator select__dropdown-indicator css-tlfecz-indicatorContainer'])[11]")
        private WebElement selectRegiaoNegocio;

        @FindBy(id = "react-select-16-option-0")
        private WebElement selectRegiaoNegocioIndex;

        @FindBy(xpath = "((//div[@class='col-lg-1'])[12]//*[contains(@class, '')])[4]")
        private WebElement selectRE;

        @FindBy(xpath = "//div[@class='card-toolbar']//button[@type='submit'][normalize-space()='Salvar']")
        private WebElement buttonSalvarContrato;

        public NewContractPage(WebDriver driver) {

                driver = WebDriverManager.getDriver();
                PageFactory.initElements(driver, this);
                wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        }

        public void newContract(String produto, String frete) {

                driver = WebDriverManager.getDriver();

                select = new Select(selectOperacao);
                select.selectByIndex(1);

                selectProduto.click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(
                                By.xpath("//div[@class='select__menu-list css-11unzgr']//*[contains(text(), '" + produto
                                                + "')]")));
                WebElement selectProdutoOption = driver.findElement(
                                By.xpath("//div[@class='select__menu-list css-11unzgr']//*[contains(text(), '" + produto
                                                + "')]"));
                wait.until(ExpectedConditions.elementToBeClickable(selectProdutoOption));
                selectProdutoOption.click();

                selectFinalidade.click();
                selectFinalidadeOptionExportacao.click();
                selectTipoContrato.click();
                selectTipoContratoOptionFixoFuturo.click();
                selectMoeda.click();
                selectMoedaOptionBRL.click();
                selectComponenteMercado.click();
                selectComponenteMercadoOptionSojaFixoBRL.click();

                selectEmpresa.click();
                js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].style.display='block';",
                                selectEmpresaOptionDIV);
                wait.until(ExpectedConditions.visibilityOf(selectEmpresaOptionSorriso));
                selectEmpresaOptionSorriso.click();

                selectSafra.click();
                js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].style.display='block';",
                                selectSafraOptionDIV);
                wait.until(ExpectedConditions.visibilityOf(selectSafraOption2425));
                selectSafraOption2425.click();

                inputDataInicio.sendKeys("01012025");
                inputDataFinal.sendKeys("20012025");
                inputQuantidadeContrato.sendKeys("5000");
                select = new Select(selectTipoFrete);
                select.selectByIndex(1);

                inputCidadeOrigem.sendKeys("RIO VERDE");

                wait.until(ExpectedConditions.visibilityOfElementLocated(
                                By.xpath("//ul[@class='MuiAutocomplete-listbox']//li[@data-option-index='5']")));
                WebElement popCidadeOrigem = driver
                                .findElement(By.xpath(
                                                "//ul[@class='MuiAutocomplete-listbox']//li[@data-option-index='5']"));
                popCidadeOrigem.click();

                inputLocalED.click();

                wait.until(ExpectedConditions.visibilityOf(selectLocalEDRioVerde));
                selectLocalEDRioVerde.click();

                inputCidadeDestino.click();

                wait.until(ExpectedConditions.visibilityOf(selectCidadeDestino));
                inputCidadeDestinoText.sendKeys("RIO VERDE");
                wait.until(ExpectedConditions.elementToBeClickable(selectCidadeDestinoRioVerde));
                selectCidadeDestinoRioVerde.click();

                inputKMAddAsfalto.sendKeys("100");
                inputKMAddChao.sendKeys("200");
                inputValorProposto.sendKeys("1500");

                buttonCalcular.click();

                wait.until(ExpectedConditions.visibilityOf(buttonAlocar));
                js.executeScript("arguments[0].style.display='block';",
                                buttonAlocar);
                buttonAlocar.click();

                buttonSalvar.click();

                wait.until(ExpectedConditions.visibilityOf(inputClienteFornecedor));
                inputClienteFornecedor.sendKeys("TESTE");

                wait.until(ExpectedConditions.visibilityOf(selectClienteFornecedor));
                js.executeScript("arguments[0].style.display='block';",
                                selectClienteFornecedor);
                js.executeScript("arguments[0].click();", selectClienteFornecedor);

                selectNegociador.click();
                wait.until(ExpectedConditions.elementToBeClickable(selectNegociadorIndex));
                selectNegociadorIndex.click();

                js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].style.display='block';",
                                selectRegiaoNegocio);
                selectRegiaoNegocio.click();

                wait.until(ExpectedConditions.elementToBeClickable(selectRegiaoNegocioIndex));
                selectRegiaoNegocioIndex.click();

                select = new Select(selectRE);
                select.selectByIndex(1);

                buttonSalvarContrato.click();

        }

}
