package org.base.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.testng.TextReport;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.*;


@Listeners(TextReport.class)
public class BaseTests {
    @BeforeTest
    public void config(){
        Configuration.browser = "chrome";
        Configuration.browserSize = "1024x768";
        Configuration.holdBrowserOpen = true;
        Configuration.headless = false;
        Configuration.timeout = 10000;
        Configuration.savePageSource=false;
        Configuration.screenshots=true;

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
        );
    }
    @BeforeMethod
    public void login(){
        Selenide.open("https://www.saucedemo.com");
//        Selenide.open("https://www.demoblaze.com/");
    }
    @AfterMethod
    public void cleanWebDriver(){
//        Selenide.clearBrowserCookies();
//        Selenide.refresh();
//        Selenide.open("about:blank");
    }
    @AfterTest
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
