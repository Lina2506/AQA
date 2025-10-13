package org.base.pages;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DetailItemPage {
    private String addToCart="//a[text()='Add to cart']";

    public void clickAddToCartButton(){
        $(byXpath(addToCart)).shouldBe(clickable, Duration.ofSeconds(10)).click();
    }
}
