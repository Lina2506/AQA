package org.base.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;

public class BaseTests {
    @BeforeTest
    public void config(){
        Configuration.browser = "chrome";
        Configuration.browserSize = "1024x768";
        Configuration.headless = true;
        Configuration.timeout = 10000;
        Configuration.savePageSource=false;
        Configuration.screenshots=true;
    }
    @BeforeMethod
    public void login(){
        Selenide.open("https://www.google.com");
    }
    @AfterMethod
    public void cleanWebDriver(){
        Selenide.clearBrowserCookies();
        Selenide.refresh();
        Selenide.open("about:blank");
    }
    @AfterTest
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
