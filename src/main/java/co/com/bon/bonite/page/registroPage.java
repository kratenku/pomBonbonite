package co.com.bon.bonite.page;

import co.com.bon.bonite.controller.ObjectController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class registroPage {

    private final WebDriver driver;

    public registroPage() throws Exception {
        driver = ObjectController.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//span[@id='show_register']")
    private WebElement registro;

    @FindBy(how = How.XPATH, using = "//input[@id='reg_username']")
    private WebElement cedula;

    @FindBy(how = How.XPATH, using = "//input[@id='first_name']")
    private WebElement nombre;

    @FindBy(how = How.XPATH, using = "//input[@id='last_name']")
    private WebElement apellido;

    @FindBy(how = How.XPATH, using = "//input[@id='reg_email']")
    private WebElement correo;

    @FindBy(how = How.XPATH, using = "//input[@id='reg_password']")
    private WebElement contrasenia;

    @FindBy(how = How.XPATH, using = "//input[@id='reg_password2']")
    private WebElement repetirContrasenia;

    @FindBy(how = How.XPATH, using = "//input[@id='privacy_policy_reg']")
    private WebElement autorizacionObligatoria;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Registrarme')]")
    private WebElement registrarme;


    public void ingresarRegistro(){
        registro.click();
    }

    public void ingresarCedula(String cedulaCliente){
        cedula.sendKeys(cedulaCliente);
    }

    public void ingresarNombre(String nombreCliente){
        nombre.sendKeys(nombreCliente);
    }

    public void ingresarApellido(String apellidoCliente){
        apellido.sendKeys(apellidoCliente);
    }

    public void ingresarCorreo(String correoCliente){
        correo.sendKeys(correoCliente);
    }

    public void ingresarContrasenia(String contraseniaCliente){
        contrasenia.sendKeys(contraseniaCliente);
    }

    public void repetirContrasenia(String repetirContraseniaCliente){
        repetirContrasenia.sendKeys(repetirContraseniaCliente);
    }

    public void aceptarPolitica(){
        autorizacionObligatoria.click();
    }

    public void registrarmeButtom(){
        registrarme.click();
    }

    public WebElement asserUser(String cedula){
        return driver.findElement(
                By.xpath("//span[contains(text(),'" + cedula + "')]")
        );

    }


}
