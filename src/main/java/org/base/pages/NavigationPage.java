package org.base.pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class NavigationPage {
    private String cartButton="//a[text()='Cart']";

    public void clickCartButton(){
        $(byXpath(cartButton)).shouldBe(clickable).click();
    }
}
