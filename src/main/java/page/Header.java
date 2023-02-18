package page;

import commonact.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Header {

    private static  By search = new By.ByXPath("//input[@id='store_nav_search_term']");

    public static WebElement searchbox(){
        return Driver.getDriver().findElement(search);
    }

}
