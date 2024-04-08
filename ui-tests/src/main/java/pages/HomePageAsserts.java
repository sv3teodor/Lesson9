package pages;

import io.qameta.allure.Step;
import org.assertj.core.api.AbstractAssert;

import static com.codeborne.selenide.Condition.visible;

public class HomePageAsserts extends AbstractAssert<HomePageAsserts, HomePage> {

    protected HomePageAsserts(HomePage actual) {
        super(actual, HomePageAsserts.class);
    }

    public static HomePageAsserts assertThat(HomePage actual) {
        return new HomePageAsserts(actual);
    }

    public HomePage page() {
        return actual;
    }

    @Step("Проверка видимости CheckBoxes")
    public HomePageAsserts checkCheckBoxesLinkIsVisible() {
        actual.checkBoxesLink.should(visible);
        return this;
    }

    @Step("Проверка видимости Dropdown")
    public HomePageAsserts checkDropdownLinkIsVisible() {
        actual.dropdownLink.should(visible);
        return this;
    }

    @Step("Проверка видимости Disappearing Elements")
    public HomePageAsserts checkDisappearingElementsIsVisible() {
        actual.disappearingElementsLink.should(visible);
        return this;
    }

    @Step("Проверка видимости Inputs")
    public HomePageAsserts checkInputsIsVisible() {
        actual.inputsLink.should(visible);
        return this;
    }

}
