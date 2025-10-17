package lessons.lesson6;

import org.base.config.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.base.Pages.*;
import static org.base.helpers.Constants.*;

public class CustomerFrameworkTest extends BaseTests {
    @Test
    public void testCustomerFramework() {
        loginPage().typeUsername(LOGIN_USERNAME);
        loginPage().typePassword(LOGIN_PASSWORD);
        loginPage().clickLoginButton();

        String headerTextFromMainPage=mainPage().getItems().get(0).text();

        mainPage().clickAddToCartButton();
        mainPage().clickShoppingCardButton();

        String headerTextFromYourCartPage=yourCartPage().getItems().get(0).text();
        Assert.assertEquals(headerTextFromMainPage, headerTextFromYourCartPage);
        yourCartPage().clickCheckoutButton();

    }
}
