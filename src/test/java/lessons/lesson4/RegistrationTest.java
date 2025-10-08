package lessons.lesson4;

import com.codeborne.selenide.Selenide;
import org.base.config.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationTest extends BaseTests {
//    створити власного юзера та залогінитись під ним (зробити тест на позитивний сценарій
//    використовуючи перевірку Assert)
    @Test
    public void registrationTest () {
        $(byXpath("//a[@id='signin2']")).shouldBe(clickable).click();

        $(byXpath("//input[@id='sign-username']")).shouldBe(and("input condition", visible, empty)).append("MorhunTest");
        $(byXpath("//input[@id='sign-password']")).shouldBe(and("input condition", visible, empty)).append("test");

        $(byXpath("//div[@id='signInModal']//button[text()='Sign up']")).shouldBe(clickable).click();

        Selenide.actions().sendKeys(Keys.ESCAPE).perform();

        $(byXpath("//a[@id='login2']")).shouldBe(clickable).click();

        $(byXpath("//input[@id='loginusername']")).shouldBe(and("input condition", visible, empty)).append("MorhunTest");
        $(byXpath("//input[@id='loginpassword']")).shouldBe(and("input condition", visible, empty)).append("test");

        $(byXpath("//div[@id='logInModal']//button[text()='Log in']")).shouldBe(clickable).click();

        $(byXpath("//a[text()='Welcome MorhunTest']")).shouldBe(visible, Duration.ofSeconds(10));
        Assert.assertTrue($(byXpath("//a[text()='Welcome MorhunTest']")).is(visible));

    }
}

