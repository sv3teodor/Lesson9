package pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;

public class CheckBoxesPage {

    ElementsCollection checkBoxes = $$x("//*[@id=\"checkboxes\"]/input");


    @Step("Проверка страницы CheckBox")
    public CheckBoxPageAsserts check() {
        return CheckBoxPageAsserts.assertThat(this);
    }

    @Step("Клик по чекбоксу А")
    public CheckBoxesPage clickCheckBox(int elementIndex) {
        checkBoxes.get(elementIndex).should(visible).click();
        return this;
    }


    @Step("Вернуть аттрибут")
    public String getAttrib(int elementIndex, String attribName) {
        return checkBoxes.get(elementIndex).getAttribute(attribName);
    }


}
