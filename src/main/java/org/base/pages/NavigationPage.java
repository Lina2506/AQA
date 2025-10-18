package org.base.pages;

import org.base.config.PageTools;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class NavigationPage extends PageTools {
    private String cartButton="//a[text()='Cart']";

    public void clickCartButton(){
        should("xpath",clickable,cartButton);
        click("xpath",cartButton);
    }
}
