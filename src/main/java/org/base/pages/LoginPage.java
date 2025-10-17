package org.base.pages;

import org.base.config.PageTools;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static org.base.helpers.CustomConditions.*;

public class LoginPage extends PageTools {
    private final String usernameInput="//input[@id='user-name']";
    private final String passwordInput=".form_input[id=password]";
    private final String loginButton="//input[@id='login-button']";

    public void typeUsername(String username) {
        should("xpath", inputCondition,usernameInput);
        type("xpath", username, usernameInput);
    }
    public void typePassword(String password) {
        should("css", inputCondition,passwordInput);
        type("css", password, passwordInput);
    }
    public void clickLoginButton() {
        should("xpath", clickable, loginButton);
        click("xpath", loginButton);
    }
}
