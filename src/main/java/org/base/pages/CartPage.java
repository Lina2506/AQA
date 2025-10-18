package org.base.pages;

import com.codeborne.selenide.Selenide;
import org.base.config.PageTools;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CartPage extends PageTools {
    private String title="//tr[@class='success']/td[text()='Samsung galaxy s6']";
    private String price="//tr[@class='success']/td[text()='360']";
    private String buttonPlaceOrder="//button[text()='Place Order']";
    private String name="//input[@id='name']";
    private String country="//input[@id='country']";
    private String city="//input[@id='city']";
    private String card="//input[@id='card']";
    private String month="//input[@id='month']";
    private String year="//input[@id='year']";
    private String purchase="//button[text()='Purchase']";
    private String successfulPurchase="//h2[text()='Thank you for your purchase!']";



    public Product getItemFromCartPage() {
        Product product = new Product();

        product.setName($(byXpath(title)).shouldBe(visible, Duration.ofSeconds(10)).text());
        product.setPrice(Integer.parseInt($(byXpath(price)).shouldBe(visible).text()));

        return product;
    }

    public void clickButtonPlaceOrder() {
        $(byXpath(buttonPlaceOrder)).shouldBe(clickable).click();
    }

    public void fillPlaceOrderForm() {
        $(byXpath(name)).shouldBe(visible).append("Polina");
        $(byXpath(country)).shouldBe(visible).append("USA");
        $(byXpath(city)).shouldBe(visible).append("India");
        $(byXpath(card)).shouldBe(visible).append("78264682");
        $(byXpath(month)).shouldBe(visible).append("Japan");
        $(byXpath(year)).shouldBe(visible).append("2020");
        $(byXpath(purchase)).shouldBe(clickable).click();
    }

    public boolean isPurchaseSuccessful() {
        Selenide.sleep(2000);
        return $(byXpath(purchase)).is(visible);
    }
}
