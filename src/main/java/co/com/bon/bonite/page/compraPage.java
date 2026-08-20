package co.com.bon.bonite.page;

import co.com.bon.bonite.controller.ObjectController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class compraPage {

    private final WebDriver driver;

    public compraPage() throws Exception {
        driver = ObjectController.getDriver();
        PageFactory.initElements(driver, this);
    }

    /*@FindBy(how = How.XPATH, using = "//li[@id='menu-item-10']//a[normalize-space()='Zapatos']")
    private WebElement moduloZapatos;






    public class
     @FindBy(how = How.XPATH, using = "")*/


}





