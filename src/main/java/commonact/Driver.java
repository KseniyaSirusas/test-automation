package commonact;

import org.openqa.selenium.WebDriver;


public class Driver {


    public static  WebDriver getDriver(){
        return BrowserFactory.createInstance("chrome");

    }
    public static void open(String url){
        Driver.getDriver().get(url);
    }
}

