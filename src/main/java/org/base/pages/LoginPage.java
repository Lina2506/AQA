package org.base.pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static org.base.helpers.CustomConditions.*;

public class LoginPage {
    private final String usernameInput="//input[@id='user-name']";
    private final String passwordInput=".form_input[id=password]";
    private final String loginButton="//input[@id='login-button']";

    public void typeUsername(String username) {
        $(byXpath(usernameInput)).shouldBe(inputCondition).append(username);
    }
    public void typePassword(String password) {
        $(byCssSelector(passwordInput)).shouldBe(inputCondition).append(password);
    }
    public void clickLoginButton() {
        $(byXpath(loginButton)).shouldBe(clickable).submit();
    }
}
