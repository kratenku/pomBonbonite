package co.com.bon.bonite.helper;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.Timestamp;

import static co.com.bon.bonite.controller.ObjectController.cleanupDriver;
import static co.com.bon.bonite.controller.ObjectController.getDriver;

public class hooksClass {

    @Before
    public void setUp() throws Exception {

       /* String browserType;

        browserType = JOptionPane.showInputDialog("Ingrese el navegador correcto: \n" +
                "chrome\n" + "firefox \n" + "edge\n" + "Nota: Al ingresar el nombre del navegador debe ser igual\n a la palabra anteriormente \n descritas");*/
        getDriver();
    }

    @AfterStep
    public void captureExceptionEvidence(Scenario scenario) throws Exception {



            byte[] screenshot = ((TakesScreenshot) getDriver())
                    .getScreenshotAs(OutputType.BYTES);

            scenario.attach(
                    screenshot,
                    "image/png",
                    "Screenshot"
            );

    }


    @After
    public void tearDown() {
        cleanupDriver();
    }
}

