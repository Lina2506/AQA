package lessons.lesson3;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.base.config.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Lesson3HW extends BaseTests {
    @Test
    public void hw() {
//На сайті https://www.demoblaze.com/ :
//– заповнити логін форму
$(byXpath("//a[@id='login2']")).click();

$(byXpath("//input[@id='loginusername']")).append("test");
$(byXpath("//input[@id='loginpassword']")).append("test");
$(byXpath("//div[@id='logInModal']//button[text()='Close']")).click();

//– заповнити форму реєстрації
        $(byXpath("//a[@id='signin2']")).click();

        $(byXpath("//input[@id='sign-username']")).append("test");
        $(byXpath("//input[@id='sign-password']")).append("test");

        $(byXpath("//div[@id='signInModal']//button[text()='Close']")).click();
//– проклікати весь список в меню Categories
        ElementsCollection listOfCategories =$$(byXpath("//div[@class='list-group']//a[position()>1]"));
        for (int i = 0; i < listOfCategories.size(); i++) {
            listOfCategories.get(i).click();
        }
//– проклікати меню навігації (і закрити вікно що відкрилось або повернутись на попередню сторінку якщо потрібно)

$(byXpath("//div[@id='navbarExample']//a[text()='Home ']")).click();

$(byXpath("//div[@id='navbarExample']//a[text()='Contact']")).click();
$(byXpath("//div[@id='exampleModal']//button[text()='Close']")).click();
$(byXpath("//div[@id='navbarExample']//a[text()='About us']")).click();
        $(byXpath("//div[@id='videoModal']//button[text()='Close']")).click();
$(byXpath("//div[@id='navbarExample']//a[text()='Cart']")).click();
$(byXpath("//a[@id='nava']")).click();
        Selenide.sleep(2000);


//– повернути колекцію айтемів на сторінці Home і клікнути на айтем з назвою Iphone 6 32gb і додати його у корзину

        ElementsCollection collectionOfItem = $$(byXpath("//h4[@class='card-title']/a"));
        List<String> collectionTextsOfItem = $$(byXpath("//h4[@class='card-title']/a")).texts();
        int indexedOfIphone = collectionTextsOfItem.indexOf("Iphone 6 32gb");
        collectionOfItem.get(indexedOfIphone).click();

$(byXpath("//a[text()='Add to cart']")).click();
Selenide.sleep(2000);
Selenide.actions().sendKeys(Keys.ENTER).perform();
Selenide.actions().sendKeys(Keys.ENTER).perform();

//– повернути текстові значення айтемів на сторінці Home
        $(byXpath("//div[@id='navbarExample']//a[text()='Home ']")).click();
    }
}
