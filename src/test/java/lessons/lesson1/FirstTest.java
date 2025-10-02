package lessons.lesson1;

import com.codeborne.selenide.Selenide;
import org.base.config.BaseTests;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.$;

public class FirstTest extends BaseTests {


    @Test
    public void firstTest() {
        $("asd").click();
    }
}