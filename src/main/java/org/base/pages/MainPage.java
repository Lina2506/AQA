package org.base.pages;

import com.codeborne.selenide.*;
import org.base.config.PageTools;


import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage extends PageTools {
    private final String logo="//div[@class='app_logo']";
    private final String headers ="//div[@class='inventory_item_name ']";
    private final String buttons="//button[text()='Add to cart']";
    private final String shoppingCardButton="//a[@class='shopping_cart_link']";

    public void waitAppLogo(){
        $(byXpath(logo)).shouldBe(visible, Duration.ofSeconds(30));
    }
    public ElementsCollection getItems(){
        shouldCollection("xpath", CollectionCondition.size(6), headers);
        return getElements("xpath", headers);
    }
    public void clickAddToCartButton(){
        should("xpath", clickable, buttons);
        click("xpath", buttons);
    }
    public void clickShoppingCardButton(){
        should("xpath", clickable, shoppingCardButton);
        click("xpath", shoppingCardButton);
    }
}
