package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class InputsPage {

    SelenideElement input = $(By.tagName("input"));

    @Step("Проверка страницы InputsPage")
    public InputsPageAsserts check() {
        return InputsPageAsserts.assertThat(this);
    }

    @Step("Ввести значение")
    public InputsPage sendString(String value) {
        input.should(visible).sendKeys(value);
        return this;
    }


}
