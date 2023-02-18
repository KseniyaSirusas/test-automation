package page;
import commonact.Driver;
import commonact.ReadProp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class PageStore {
   public static final By privacy = new By.ByXPath("//div[@id='footer_text']//a[1]");


   public static void clickPrivacy(){
          Driver.getDriver().findElement(privacy).click();}


    public static final By languages = new By.ByXPath("//div[@id='languages']");
    public static void searchbox() throws IOException {
        Header.searchbox().sendKeys(ReadProp.keywords(), Keys.ENTER);}



    public static int start=0;
    public static int startn=start+1;
    public static final By flags= new By.ByXPath("//div[@id='languages']//a["+startn+"]");

    public static void clicklanguages(){
        for(int start=0; start <= 8; start++)
        {
             startn=start+1;

            Driver.getDriver().findElement(flags).click();
            Driver.getDriver().manage().timeouts().pageLoadTimeout(30, SECONDS);
    }
    }
    public static By revisionDate= new By.ByXPath("//div[@id='newsColumn']");

    public static List<WebElement> gamesList = Driver.getDriver().findElements(By.xpath("//div[@id='search_resultsRows']//a"));
    public static void searchbox2(){
        WebElement game2= Driver.getDriver().findElement(By.xpath("//div[@id='search_resultsRows']//a[2]//span"));

        By search=new By.ByXPath("//input[@id='store_nav_search_term']");;
        Driver.getDriver().findElement(search).sendKeys(game2.getText(), Keys.ENTER);
    }


    public static ArrayList<String> list1  = new ArrayList<String>();
    static By items=new By.ByXPath("//div[@id='search_resultsRows']//a["+startn+"]");
    public static void saveTolist1(){
        for(start=0; start <= 2; start++) {
         startn=start+1;
        list1.add(String.valueOf(Driver.getDriver().findElements(items)));}}


    public static ArrayList<String> list2  = new ArrayList<String>();
    public static void saveTolist2(){
        for(start=0; start <= 2; start++) {
            startn=start+1;
            list2.add(String.valueOf(Driver.getDriver().findElements(items)));}}



}

