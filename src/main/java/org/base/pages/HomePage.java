package org.base.pages;


import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    private String name="//h4[@class='card-title']/a";
    private String price="//h4[@class='card-title']/following-sibling::h5";

    public Product getItemFromHomePage(){

        Product product = new Product();

        product.setName($(byXpath(name)).shouldBe(visible, Duration.ofSeconds(10)).text());
        product.setPrice(Integer.parseInt($(byXpath(price)).shouldBe(visible).text().replace("$","")));
        return product;
    }
    public void clickProduct(){
        $(byXpath(name)).shouldBe(clickable).click();
    }
}
