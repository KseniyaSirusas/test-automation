package test;

import basetest.BaseTest;
import commonact.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.PageStore;
import testData.TestData;

import java.io.IOException;


public class Test2 extends BaseTest{


    @Test
    public void test() throws IOException {

        PageStore.searchbox();
        Assert.assertEquals(Driver.getDriver().getTitle(), TestData.searchpage);

        for (WebElement e: PageStore.gamesList){
            Assert.assertTrue(e.getText().contains(TestData.firstgame));
            Assert.assertTrue(PageStore.gamesList.get(0).getText().contains(TestData.firstgame));
        }

        PageStore.saveTolist1();
        PageStore.searchbox2();
         PageStore.saveTolist2();

        Assert.assertEquals(PageStore.list1, PageStore.list2);

    }


}
