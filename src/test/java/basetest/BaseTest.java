package basetest;

import commonact.Driver;
import commonact.ReadProp;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class BaseTest {

    public static String cookies = "//div[@id='acceptAllButton']";

    @BeforeTest
    public static void before() throws IOException {
    Driver.getDriver();

    Driver.open(ReadProp.pagename());

        Driver.getDriver().findElement(By.xpath(cookies)).click();

}
@AfterTest
    public static void after() throws IOException {
        Driver.getDriver().quit();
    }
}
