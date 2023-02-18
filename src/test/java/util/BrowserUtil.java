package util;

import commonact.Driver;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;
import java.util.ArrayList;

public class BrowserUtil {

    public static void scrolldown() throws IOException {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public static void toNewTab() throws IOException {
        String oldTab = Driver.getDriver().getWindowHandle();
        ArrayList<String> newTab = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        newTab.remove(oldTab);
        Driver.getDriver().switchTo().window(newTab.get(0));
    }
}
