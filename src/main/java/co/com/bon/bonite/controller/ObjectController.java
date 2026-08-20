package co.com.bon.bonite.controller;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ObjectController {
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver() throws Exception {
        if (webDriver.get() == null){
            webDriver.set(createDriver());
        }
        return webDriver.get();
    }

    public static WebDriver createDriver() throws Exception {
        //String browserType
        WebDriver driver = null;

        /*DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName(browserType);*/


        switch (getBrowserType()) {
            case "chrome" -> {
                //String proxy = "localhost:8080";
                //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/driver/chromedriver.exe");
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins=*");
                chromeOptions.setExperimentalOption("useAutomationExtension", false);
                chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
                chromeOptions.addArguments("--disable-web-security");
                chromeOptions.addArguments("--disable-extensions");
                chromeOptions.addArguments("--disable-notification");
                chromeOptions.addArguments("--ignored-certificate");
                //chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
                //chromeOptions.addArguments("--proxy-server=http://"+proxy);
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver = new ChromeDriver(chromeOptions);
                break;
            }
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                //firefoxOptions.addArguments("--remote-allow-origins=*");
                //firefoxOptions.setExperimentalOption("useAutomationExtension", false);
                firefoxOptions.addArguments("--disable-blink-features=AutomationControlled");
                firefoxOptions.addArguments("--disable-web-security");
                firefoxOptions.addArguments("--disable-extensions");
                firefoxOptions.addArguments("--disable-notification");
                firefoxOptions.addArguments("--ignored-certificate");
                firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver = new FirefoxDriver(firefoxOptions);
                break;
            }
            case "edge" -> {
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--remote-allow-origins=*");
                //firefoxOptions.setExperimentalOption("useAutomationExtension", false);
                edgeOptions.addArguments("--disable-blink-features=AutomationControlled");
                edgeOptions.addArguments("--disable-web-security");
                edgeOptions.addArguments("--disable-extensions");
                edgeOptions.addArguments("--disable-notification");
                edgeOptions.addArguments("--ignored-certificate");
                edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver = new EdgeDriver(edgeOptions);
                break;

            }
            default -> {
                String exceptionMessage = String.valueOf(JOptionPane.showInputDialog("Navegador ingresado no es el correcto \n"+"Ingrese nuevamente el navegador correcto: \n" +
                        "chrome\n" + "firefox \n" + "edge\n" + "Nota: Al ingresar el nombre del navegador debe ser igual\n a la palabra anteriormente \n descritas"));
                throw new Exception (exceptionMessage);
            }
        }
        driver.manage().window().maximize();
        driver.get(getUrl());
        return driver;
    }

    private static String getBrowserType() throws IOException {
        String browserType = null;

        try {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+ File.separator+
                    "src" + File.separator + "main" + File.separator + "resources" +File.separator + "properties" +File.separator + "config.properties");
            properties.load(fileInputStream);
            browserType = properties.getProperty("browser").toLowerCase().trim();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return browserType;

    }

    private static String getUrl() throws IOException {

        String url = null;

        try {
            Properties properties = new Properties();

            FileInputStream fileInputStream = new FileInputStream(
                    System.getProperty("user.dir")
                            + File.separator
                            + "src"
                            + File.separator
                            + "main"
                            + File.separator
                            + "resources"
                            + File.separator
                            + "properties"
                            + File.separator
                            + "config.properties"
            );

            properties.load(fileInputStream);

            url = properties
                    .getProperty("url.desarrollo")
                    .trim();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return url;
    }

    public static void cleanupDriver(){
        webDriver.get().quit();
        webDriver.remove();
    }

}