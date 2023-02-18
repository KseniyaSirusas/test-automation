package commonact;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BrowserFactory {
    private static WebDriver driver = null;
    public static WebDriver createInstance(String browserName) {

        if (browserName.toLowerCase().contains("firefox")&&driver==null) {
            driver = new FirefoxDriver();
            return driver;

        }

        if (browserName.toLowerCase().contains("internet")&&driver==null) {

            driver = new InternetExplorerDriver();
            return driver;

        }
        if (browserName.toLowerCase().contains("chrome")&&driver==null) {

            ChromeOptions option = new ChromeOptions();
            option.addArguments("--incognito");
            option.addArguments("--lang=en");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(option);
            driver.manage().window().maximize();
            try {
        driver.manage().timeouts().implicitlyWait(ReadProp.property(), SECONDS);
    } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }

        return driver;

    }



    }
