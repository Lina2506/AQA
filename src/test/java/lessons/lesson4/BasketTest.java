package lessons.lesson4;

import com.codeborne.selenide.Selenide;
import org.base.config.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BasketTest extends BaseTests {
    //додати айтем з сторінки Home в корзину та перевірити що він там дійсно є,
    // після цього видалити айтем з корзини і перевірити що корзина порожня
    @Test
    public void addAndRemoveItemFromCartTest() {
        $(byXpath("//a[text()='Nexus 6']")).shouldBe(clickable).click();
        $(byXpath("//a[text()='Add to cart']")).shouldBe(clickable).click();
        Selenide.actions().sendKeys(Keys.ESCAPE).perform();
        $(byXpath("//a[text()='Cart']")).shouldBe(clickable).click();
        Selenide.sleep(2000);
        Assert.assertTrue($(byXpath("//tr[@class='success']/td[text()='Nexus 6']")).is(visible));
        $(byXpath("//a[text()='Delete']")).shouldBe(clickable).click();
        Selenide.sleep(2000);
        Assert.assertFalse($(byXpath("//tr[@class='success']/td[text()='Nexus 6']")).is(visible));
    }
}
