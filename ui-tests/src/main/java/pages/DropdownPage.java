package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class DropdownPage {
    SelenideElement dropDown = $("#dropdown");

    @Step("Проверка страницы Dropdown")
    public DropdownPageAsserts check() {
        return DropdownPageAsserts.assertThat(this);
    }

    @Step("Выбрать элемент")
    public DropdownPage selectOptions(int itemNumber) {
        dropDown.selectOption(itemNumber);
        return this;
    }


}
