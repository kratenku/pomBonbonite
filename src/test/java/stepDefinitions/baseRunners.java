package stepDefinitions;

import io.cucumber.core.cli.Main;
import org.openqa.selenium.WebDriver;

public class baseRunners {
    public static WebDriver driver;
    public static void main(String args[]) throws Throwable {
        try {
            Main.main(new String[] {

                            "-g","stepDefinitions",
                            //"-g","com.sadakar.testng.runner",

                            "classpath:features",

                            "-t","@registrouno",


                            "-p", "pretty",
                            "-p", "json:target/cucumber-reports/cucumber.json",
                            "-p", "html:target/cucumber-reports/cucumberreport.html",
                            "-p","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

                            "-m"
                    }
            );
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Main method exception : " + e);
        }
    }
}