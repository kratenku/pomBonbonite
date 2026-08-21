package co.com.bon.bonite.page;

import co.com.bon.bonite.controller.ObjectController;
import com.aventstack.extentreports.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class compraPage {

    private final WebDriver driver;

    public compraPage() throws Exception {
        driver = ObjectController.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "div[id='toggle-account-menu'] a[class='hover:opacity-70 transition-all'] svg")
    private WebElement seleccionLogin;

    @FindBy(how = How.XPATH, using = "//input[@id='username']")
    private WebElement seleccionUsuario;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    private WebElement seleccionarContrasenia;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Iniciar Sesión']")
    private WebElement seleccionarInicioSesion;

    @FindBy(how = How.XPATH, using = "//li[@id='menu-item-10']//a[normalize-space()='Zapatos']")
    private WebElement moduloZapatos;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Comprar Ahora']")
    private WebElement botonComprarAhora;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Finalizar compra']")
    private WebElement finalCompra;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Continuar']")
    private WebElement continuarCompra;

    @FindBy(how = How.XPATH, using = "//h1[normalize-space()='Finalizar compra']")
    private WebElement assertMessageFinalizar;

    //https://www.bon-bonite.com/
    //


    public void seleccionLogin(){
        seleccionLogin.click();
    }

    public void seleccionDeUsuario(String cedulaUsuario){
        seleccionUsuario.sendKeys(cedulaUsuario);
    }

    public void seleccionarContrasenia(String contrasenia){
        seleccionarContrasenia.sendKeys(contrasenia);
    }

    public void seleccionSesion(){
        seleccionarInicioSesion.click();
    }

    public void seleccionModuloCompra(){
        moduloZapatos.click();
    }

    public void assertProducto(String producto){
        driver.findElement(
                By.xpath("//img[@id='"+producto+"']")
        ).click();

        //img[@id='image-1026396']

    }

    public void asserTalla(String talla){
        driver.findElement(
                By.xpath("//button[normalize-space()='"+talla+"']")
        ).click();
    }

    public void botonComprarAhora(){
        botonComprarAhora.click();
    }

    public void botonFinalizarCompra(){
        finalCompra.click();
    }

    public void botonContinuarCompra(){
        continuarCompra.click();
    }

    public void assertFinalizarCompra(){
        String texto = assertMessageFinalizar.getText();

        assertEquals("Finalizar compra",texto);
    }





}





