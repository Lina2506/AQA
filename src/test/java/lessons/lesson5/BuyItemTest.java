package lessons.lesson5;

import org.base.config.BaseTests;
import org.base.pages.Product;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.base.Pages.*;

public class BuyItemTest extends BaseTests {
    @Test
    public void buyItemTest() {
        Product itemFromHomePage = homePage().getItemFromHomePage();

        homePage().clickProduct();
        detailItemPage().clickAddToCartButton();
        navigationPage().clickCartButton();

        Product itemFromCartPage = cartPage().getItemFromCartPage();

        Assert.assertEquals(itemFromCartPage, itemFromHomePage);

        cartPage().clickButtonPlaceOrder();

        cartPage().fillPlaceOrderForm();

        Assert.assertTrue(cartPage().isPurchaseSuccessful());

    }
}
