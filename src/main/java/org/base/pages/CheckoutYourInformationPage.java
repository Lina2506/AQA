package org.base.pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.base.helpers.CustomConditions.*;

public class CheckoutYourInformationPage {
    private final String firstnameInput="//input[@id='first-name']";
    private final String lastnameInput="//input[@id='last-name']";
    private final String postalcodelInput="//input[@id='postal-code']";

    private final String continueButton="//input[@id='continue']";

    public void fillInformationInputs(String firstname, String lastname, String postalcode) {
        $(byXpath(firstnameInput)).shouldBe(inputCondition).append(firstname);
        $(byXpath(lastnameInput)).shouldBe(inputCondition).append(lastname);
        $(byXpath(postalcodelInput)).shouldBe(inputCondition).append(postalcode);
    }
    public void clickContinueButton() {
        $(byXpath(continueButton)).shouldBe(clickable).click();
    }
}
