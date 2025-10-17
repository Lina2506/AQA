package org.base.pages;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class CheckoutCompletePage {
    private final String completeHeader="//h2[text()='Thank you for your order!']";

    public boolean isCompleteHeaderVisible(){
        return $(byXpath(completeHeader)).is(visible);
    }
}
