import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchJUnit5CodeTests {

    @Test
    void searchJUnit5CodeTest(){
        //Открыть страницу
        open("https://github.com/");
        //Перейти в раздел Wiki
        $(byName("q")).setValue("Selenide").pressEnter();
        $("ul.repo-list li a").click();
        $(byText("Wiki")).click();
        //Проверить наличие страницы и провалиться в нее
        $(byText("SoftAssertions")).click();
        //Проверить наличие кода для JUnit5
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
