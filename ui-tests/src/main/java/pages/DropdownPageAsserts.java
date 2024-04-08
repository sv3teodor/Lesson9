package pages;

import io.qameta.allure.Step;
import org.assertj.core.api.AbstractAssert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class DropdownPageAsserts extends AbstractAssert<DropdownPageAsserts, DropdownPage> {

    protected DropdownPageAsserts(DropdownPage actual) {
        super(actual, DropdownPageAsserts.class);
    }

    public static DropdownPageAsserts assertThat(DropdownPage actual) {
        return new DropdownPageAsserts(actual);
    }

    public DropdownPage page() {
        return actual;
    }

    @Step("Проверка текста dropdown")
    public DropdownPageAsserts dropdownCheckText(String expectedText) {
        actual.dropDown.shouldHave(text(expectedText));
        return this;
    }

    @Step("Проверка видимости dropdown")
    public DropdownPageAsserts dropdownCheckIsVisible() {
        actual.dropDown.should(visible);
        return this;
    }


}
