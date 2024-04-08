package pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class DisappearingElementsPage {

    ElementsCollection disappearingElements = $$(By.cssSelector("ul > li"));

    @Step("Проверка страницы Disappearing Elements")
    public DisappearingElementsPageAsserts check() {
        return DisappearingElementsPageAsserts.assertThat(this);
    }


}
