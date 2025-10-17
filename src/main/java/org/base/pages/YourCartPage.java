package org.base.pages;

import com.codeborne.selenide.ElementsCollection;
import org.base.config.PageTools;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class YourCartPage extends PageTools{
    private final String items="//div[@class='inventory_item_name']";
    private final String checkoutButton="//button[@id='checkout']";

    public ElementsCollection getItems(){
        return getElements("xpath", items);
    }
    public void clickCheckoutButton(){
        should("xpath", clickable, checkoutButton);
        click("xpath", checkoutButton);
    }
}
