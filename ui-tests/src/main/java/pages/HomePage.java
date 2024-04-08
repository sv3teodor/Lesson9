package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;

public class HomePage {
    SelenideElement checkBoxesLink = $(linkText("Checkboxes"));
    SelenideElement dropdownLink = $(linkText("Dropdown"));
    SelenideElement disappearingElementsLink = $(linkText("Disappearing Elements"));
    SelenideElement inputsLink = $(linkText("Inputs"));

    public HomePageAsserts check() {
        return HomePageAsserts.assertThat(this);
    }

    @Step("Клик по CheckBoxes на главной странице")
    public CheckBoxesPage clickCheckBoxesLink() {
        checkBoxesLink.should(visible).click();
        return new CheckBoxesPage();
    }

    @Step("Клик по Dropdown на главной странице")
    public DropdownPage clickDropdownLink() {
        dropdownLink.should(visible).click();
        return new DropdownPage();
    }

    @Step("Клик по Disappearing Elements на главной странице")
    public DisappearingElementsPage clickDisappearingElementsLink() {
        disappearingElementsLink.should(visible).click();
        return new DisappearingElementsPage();
    }

    @Step("Клик по Inputs на главной странице")
    public InputsPage clickInputsLink() {
        inputsLink.should(visible).click();
        return new InputsPage();
    }


}
