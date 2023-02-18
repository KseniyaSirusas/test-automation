package test;

import basetest.BaseTest;
import commonact.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.PageStore;
import testData.TestData;
import util.BrowserUtil;
import java.io.IOException;

import static page.PageStore.start;


public class Test1 extends BaseTest{

    @Test
    public void test() throws IOException {
        Assert.assertEquals(Driver.getDriver().getTitle(), TestData.welcome);

        BrowserUtil.scrolldown();

        PageStore.clickPrivacy();

        BrowserUtil.toNewTab();
        Assert.assertEquals(Driver.getDriver().getTitle(), TestData.privacypolicy);

        Assert.assertTrue(Driver.getDriver().findElement(PageStore.languages).isDisplayed());

       PageStore.clicklanguages();
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().toString().contains(TestData.listlanguages[start].toString()));

            BrowserUtil.scrolldown();

        Assert.assertTrue(Driver.getDriver().findElement(PageStore.revisionDate).getText().contains("Revision Date: January 1, "+TestData.year));

        }


    }

