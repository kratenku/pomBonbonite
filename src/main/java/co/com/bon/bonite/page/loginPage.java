package co.com.bon.bonite.page;

import co.com.bon.bonite.controller.ObjectController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class loginPage {

    private WebDriver driver;

    public loginPage() throws Exception {
        this.driver = ObjectController.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='user-icon-wrap']//following::a | //div[contains(@class,'menu')]//a")
    private List<WebElement> opcionPerfil;

    @FindBy(how = How.XPATH, using = "//input[@name='billing_phone']")
    private WebElement telefonoRegistro;


    @FindBy(how = How.CSS, using = "body > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(1)")
    private WebElement seleccionActualizar;

    @FindBy(how = How.CSS, using = "body > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(2)")
    private WebElement seleccionGuardar;

    public void selecctorPerfilDato() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement iconoUsuario = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='user-icon-wrap']"))
        );
        iconoUsuario.click();


        // 3. Recorre el menú ya desplegado y selecciona "DATOS"
        for (WebElement option : opcionPerfil) {
            String opcionTexto = option.getText().trim();

            if (opcionTexto.equalsIgnoreCase("DATOS")) {
                option.click();
                break;
            }
        }
    }

    public void infoCambioTlefono(String telefono){
        seleccionActualizar.click();
        telefonoRegistro.sendKeys(telefono);
    }

    public void seleccionarGuardar(){
        seleccionGuardar.click();
    }

    public WebElement mensajeActualizacion(String mensajeActualizado) throws InterruptedException {
        Thread.sleep(10000);
        return driver.findElement(
                By.xpath("//span[normalize-space()='"+mensajeActualizado+"']")
        );

    }
}