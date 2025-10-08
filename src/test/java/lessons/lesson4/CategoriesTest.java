package lessons.lesson4;

import org.base.config.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$$;

public class CategoriesTest extends BaseTests {
    //перевірити що в меню Categories вірний список
    @Test
    public void testCategories() {
    //що очікуємо?
        List<String> expectedCategories = List.of("Phones","Laptops","Monitors");
        List<String> actualCategories=$$(byXpath("//div[@class='list-group']/a[position()>1]")).texts();

        Assert.assertEquals(actualCategories, expectedCategories);
    }
}
