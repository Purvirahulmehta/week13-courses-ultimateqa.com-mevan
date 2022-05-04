package com.ultimateqa.com.testbase;

import com.ultimateqa.com.propertyreader.PropertyReader;
import com.ultimateqa.com.utility.Utility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class TestBase extends Utility {
    String browser= PropertyReader.getInstance().getProperty("browser");
    @BeforeTest
    public void setUp(){
        selectBrowser(browser);
    }
    @AfterClass
    public void tearDown(){
        closeBrowser();
    }
}
