package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.assertj.core.api.AbstractAssert;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.visible;

public class CheckBoxPageAsserts extends AbstractAssert<CheckBoxPageAsserts, CheckBoxesPage> {

    protected CheckBoxPageAsserts(CheckBoxesPage actual) {
        super(actual, CheckBoxPageAsserts.class);
    }

    public static CheckBoxPageAsserts assertThat(CheckBoxesPage actual) {
        return new CheckBoxPageAsserts(actual);
    }

    public CheckBoxesPage page() {
        return actual;
    }

    @Step("Проверка видимости чекбокса A")
    public CheckBoxPageAsserts checkBoxIsVisible(int itemIndex) {
        actual.checkBoxes.get(itemIndex).should(visible);
        return this;
    }

    @Step("Проверка аттрибута")
    public CheckBoxPageAsserts checkAttributes(int elementIndex, String attribName, String targetValue) {
        actual.checkBoxes
                .get(elementIndex)
                .as("Значение аттрибута" + attribName + " не соответствует ожидаемому" + targetValue)
                .should(Condition.attribute(attribName, targetValue));
        return this;
    }

    @Step("Проверка статуса чекбокса ")
    public CheckBoxPageAsserts checkCheckBoxIsChecked(int elementIndex) {
        actual.checkBoxes.get(elementIndex).should(checked);
        return this;
    }


}
