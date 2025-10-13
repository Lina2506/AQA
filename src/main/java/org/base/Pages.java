package org.base;

import org.base.pages.CartPage;
import org.base.pages.DetailItemPage;
import org.base.pages.HomePage;
import org.base.pages.NavigationPage;

public class Pages {
    private static HomePage homePage;

    private static DetailItemPage detailItemPage;
    private static NavigationPage navigationPage;
    private static CartPage cartPage;


    public static HomePage homePage() {
        if(homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public static DetailItemPage detailItemPage() {
        if(detailItemPage == null) {
            detailItemPage = new DetailItemPage();
        }
        return detailItemPage;
    }
    public static NavigationPage navigationPage() {
        if(navigationPage == null) {
            navigationPage = new NavigationPage();
        }
        return navigationPage;
    }
    public static CartPage cartPage() {
        if(cartPage == null) {
            cartPage = new CartPage();
        }
        return cartPage;
    }
}
